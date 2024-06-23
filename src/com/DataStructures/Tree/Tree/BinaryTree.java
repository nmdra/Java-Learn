package DataStructures.Tree.Tree;

public class BinaryTree {
    private Node root;

    public BinaryTree(int data,int key) {
        root = new Node(data,key);
    }

    public BinaryTree(Node root) {
        this.root = root;
    }

    public BinaryTree() {
        this.root = null;
    }

    // Find Key

    public Node find(int key) {
        Node current = root;

        while (current.key != key) {
            if (key < current.key) current = current.left;
            else current = current.right;

            if (current == null) return null;
        }

        return current;
    }

    private Node findRecursion(int key, Node current) {
        // If you change the order of the conditions to (current.key == key || current == null)
        // in the base case of the recursive findRecursion method, you may run into a NullPointerException.
        if (current == null || current.key == key) return current;

        return   current.key > key
                ? findRecursion(key, current.left)
                : findRecursion(key, current.right);
    }

    public Node findRec(int key){
        return findRecursion(key,root);
    }

    // Find Node Value
    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    private Node insert(int key, int data, Node current) {

        if (current == null){
            return new Node(key,data);
       }

       if (current.key > key) {
           current.left = insert(key,data, current.left);
       } else if (current.key < key) {
           current.right = insert(key,data, current.right);
       }

       return current;
    }

    public void add(int data, int key) {
       root = insert(key,data, root);
    }

    // InOrder
    private void inorderTraversal(Node current) {
        if (current == null) return;

        inorderTraversal(current.left);
        current.print();
        inorderTraversal(current.right);
    }

    public void inorder() {
        inorderTraversal(root);
    }

    // PreOrder
    private void preorderTraversal(Node current) {
        if (current == null) return;

        current.print();
        preorderTraversal(current.left);
        preorderTraversal(current.right);
    }

    public void preorder() {
        preorderTraversal(root);
    }

    // PostOrder
    private void postorderTraversal(Node current) {
        if (current == null) return;

        postorderTraversal(current.left);
        postorderTraversal(current.right);
        current.print();
    }

    public void postorder() {
        postorderTraversal(root);
    }

    // Minimum
    private Node minimum(Node current){
        return current.left == null ? current : minimum(current.left);
    }

    public int min(){
        return minimum(root).key;
    }

    // Maximum
    private Node maximum(Node current){
        return current.right == null ? current : maximum(current.right);
    }

    public int max(){
        return maximum(root).key;
    }

    // Delete
    private Node deleteRec(Node current, int key) {
        if (current == null) return null;

        if(current.key > key){
            current.left = deleteRec(current.left,key);
        } else if (current.key < key) {
            current.right = deleteRec(current.right,key);
        } else {
            if (current.left == null) return current.right;
            else if (current.right == null) return current.left;

            current.key = minimum(current.right).key;
            current.right = deleteRec(current.right,current.key);
        }

        return current;
    }

    public void delete(int key) {
        deleteRec(root,key);
//        System.out.println( (deleteRec(root, key) != null)
//                ? "\n" + key + " is  Deleted"
//                : "\n" + key + " is Not Found");
    }
}
