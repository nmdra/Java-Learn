package DataStructures.LinkedList.LinkedList2;

public class LinkedList {
    private Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedList() {
        head = null;
    }

    public void insertBegin(int data) {
        Node newNode = new Node(data);

//        if (head == null) {
//            head = newNode;
//            return;
//        }

        newNode.next = head;
        head = newNode;
    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void insertBefore(int key, int data) {

        Node newNode = new Node(data);

        // If the list is empty, return without inserting
        if (head == null) {
            return;
        }

        // If the head node itself holds the key
        if (head.data == key) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            if (current.next.data == key) {
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }

        System.out.println("Key not found");
    }

    public void insertAfter(int key, int data) {

        Node newNode = new Node(data);

        // If the list is empty, return without inserting
        if (head == null) {
            return;
        }

        // If the head node itself holds the key
        if (head.data == key) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            if (current.data == key) {
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }

        System.out.println("Key not found");

    }

    public int deleteBegin() {
        Node temp = head;

        head = head.next;

        return temp.data;
    }

    public int deleteEnd() {
        Node current = head;

        if (head.next == null) {
            Node temp = head;
            head = null;
            return temp.data;
        }

        while (current.next.next != null) {
            current = current.next;
        }

        Node temp = current.next;
        current.next = null;
        return temp.data;
    }

    public void deleteAt(int key) {
        // Check if the list is empty
        if (head == null) {
            return;
        }

        // Check if the head node itself holds the key
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node current = head;

        // Traverse the list to find the node before the key
        while (current.next != null) {
            if (current.next.data == key) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

        System.out.println("key not Found");
    }

    public boolean find(int key) {
        Node current = head;

        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void displayList(){
        Node current = head;

        while (current != null) {
            System.out.print(current.data + ", ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insertions
        list.insertBegin(1);
        list.insertBegin(2);
        list.insertBegin(3);
        list.insertBegin(4);
        list.insertEnd(5);
        list.insertBefore(5, 10);
        list.insertAfter(10, 11);

        // Display list after insertions
        System.out.println("List after insertions:");
        list.displayList();

        // Deletions and finds
        System.out.println("Output of deleteEnd(): " + list.deleteEnd());
        System.out.println("Output of deleteBegin(): " + list.deleteBegin());

        System.out.println("Output of find(): " + list.find(3));

        list.deleteAt(3);

        System.out.println("Output after deleteAt(): " + list.find(3));

        // Display list after deletions
        System.out.println("List after deletions:");
        list.displayList();
    }
}
