package DataStructures.Tree.Tree;

public class Node {
    int key;
    double value;
    Node left, right;

    public Node(int key, double value) {
        this.key = key;
        this.value = value;
        this.left = this.right = null;
    }

    public void print() {
        System.out.print(key + ", ");
    }
}
