package YT_Graphs;

import java.util.*;

public class SimpleGraph {
    int V; // number of vertices
    ArrayList<Integer>[] adjList; // adjacency list

    // Constructor: create empty adjacency list for V vertices
    @SuppressWarnings("unchecked")
    public SimpleGraph(int V) {
        this.V = V;
        adjList = (ArrayList<Integer>[]) new ArrayList[V]; // create array of ArrayList
        for (int i = 0; i < V; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    // add undirected edge u <-> v
    public void addEdge(int u, int v) {
        adjList[u].add(v); // add v to u's list
        adjList[v].add(u); // add u to v's list (because undirected)
    }

    // print adjacency list of the graph
    public void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.println(i + " -> " + adjList[i]);
        }
    }

    // BFS starting from 'start'
    public void BFS(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int neighbor : adjList[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    // DFS helper (recursive)
    private void DFSUtil(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adjList[node]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    // DFS starting from 'start'
    public void DFS(int start) {
        boolean[] visited = new boolean[V];
        DFSUtil(start, visited);
        System.out.println();
    }


    public static void main(String[] args) {
        SimpleGraph g = new SimpleGraph(5);


        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        System.out.println("Graph:");
        g.printGraph();

        System.out.println("BFS starting from 0:");
        g.BFS(0);

        System.out.println("DFS starting from 0:");
        g.DFS(0);
    }
}
