package YT_Graphs;

public class BinaryTree {

    // ---------------- NODE CLASS ----------------
    class Node {
        int data, node;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Root of the tree
    Node root;

    // ---------------- INSERT (BST) ----------------
    Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);

        return root;
    }

    // ---------------- INORDER ----------------
    void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // ---------------- PREORDER ----------------
    void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // ---------------- POSTORDER ----------------
    void postorder(Node root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // ---------------- SEARCH ----------------
    boolean search(Node root, int key) {
        if (root == null) return false;

        if (root.data == key)
            return true;
        else if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    // ---------------- HEIGHT ----------------
    int height(Node root) {
        if (root == null) return 0;

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    // ---------------- MAIN METHOD ----------------
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        int[] values = {50, 30, 70, 20, 40, 60, 80};

        // Insert values into BST
        for (int v : values) {
            tree.root = tree.insert(tree.root, v);
        }

        System.out.print("Inorder Traversal   : ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.print("Preorder Traversal  : ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.print("Postorder Traversal : ");
        tree.postorder(tree.root);
        System.out.println();

        System.out.println("Search 40 : " + tree.search(tree.root, 40));
        System.out.println("Search 90 : " + tree.search(tree.root, 90));

        System.out.println("Height of Tree : " + tree.height(tree.root));
    }
}
