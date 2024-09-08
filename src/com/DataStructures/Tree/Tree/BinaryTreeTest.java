package DataStructures.Tree.Tree;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Insert nodes
        tree.add(50, 50);
        tree.add(30, 30);
        tree.add(70, 70);
        tree.add(15, 20);
        tree.add(40, 40);
        tree.add(60, 60);
        tree.add(80, 80);
        tree.add(55, 55);

        /*
                Tree Structure
                     50
                   /   \
                 30     70
                / \    /  \
              20  40  60  80
                     /
                    55
         */

        // Find and print nodes
//        int[] keysToFind = {50, 30, 70, 20};
//
//        for (int key : keysToFind) {
//            Node result = tree.find(key);
//            if (result != null) {
//                System.out.println("Found node with key " + key + " and data " + result.value);
//            } else {
//                System.out.println("Node with key " + key + " not found");
//            }
//        }
//
//        int[] valuesToFind = {15, 60, 100};
//
//        for (int value : valuesToFind) {
//            boolean result = tree.containsNode(value);
//            if (result) {
//                System.out.println("Found node with value " + value + " .");
//            } else {
//                System.out.println("Node with value " + value + " not found");
//            }
//        }

//        System.out.println("Minimum Key in Tree: " + tree.min());
//        System.out.println("Maximum Key in Tree: " + tree.max());
//        System.out.println(tree.findRec(71) == null ? "Node with key not found" : "Found node with key");

        System.out.println("=== InOrder(Ascending traversal ===");
        tree.inorder();
        System.out.println("\n=== Descending Order traversal ===");
        tree.descendingOrder();

        System.out.println("\n=== Preorder traversal ===");
        tree.preorder();
        System.out.println("\n=== Postorder traversal ===");
        tree.postorder();
;

        System.out.println("\n\n=== Delete Node ===");
        tree.delete(30);
        tree.inorder();
        System.out.println();
        tree.delete(55);
        tree.inorder();
        System.out.println();
        tree.delete(50);
        tree.inorder();
        System.out.println();
        tree.delete(99);
        tree.inorder();
    }
}
