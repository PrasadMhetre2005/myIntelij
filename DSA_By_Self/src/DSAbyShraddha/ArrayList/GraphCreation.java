package DSAbyShraddha.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GraphCreation {

    int v;
    ArrayList<ArrayList<Integer>> res;

    GraphCreation(int v){

        this.v = v;
        res = new ArrayList<>();
        for(int i=0;i<v;i++){
            res.add(new ArrayList<>());
        }
    }
    void addEdge(int n, int e) {
        res.get(n).add(e);
        res.get(e).add(n);
    }
    void PrintGraph(){

        for (int i=0;i<v;i++){

            System.out.println(i+"--->"+res.get(i));
        }
    }


    public static void main(String[] args) {
         GraphCreation g = new GraphCreation(5);

        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);

        g.PrintGraph();
    }


}
