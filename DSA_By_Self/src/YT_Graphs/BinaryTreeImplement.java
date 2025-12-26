package YT_Graphs;

public class BinaryTreeImplement {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static Node root;

    // Insert in BST
    static Node insert(Node root, int key) {
        if (root == null)
            return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);

        return root;
    }

    // Inorder Traversal
    static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] values = {50, 30, 20, 40, 70, 60, 80};

        for (int v : values)
            root = insert(root, v);

        System.out.print("Inorder Traversal: ");
        inorder(root);
    }
}
