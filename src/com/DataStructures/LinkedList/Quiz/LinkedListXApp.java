package DataStructures.LinkedList.Quiz;

public class LinkedListXApp {
    public static void main(String[] args) {
        LinkedListX list = new LinkedListX();

        list.insertFirst("Nima", 10.33);
        list.insertFirst("Nimal", 10.34);
        list.insertFirst("Nimali", 10.35);
        list.insertFirst("Nimalika", 10.36);
        list.insertFirst("Nimalikani", 10.37);

        list.displayList();

        list.deleteAll();

        list.displayList();

        list.insertEnd("Nima", 10.33);
        list.insertEnd("Nimal", 10.34);
        list.insertEnd("Nimali", 10.35);
        list.insertEnd("Nimalika", 10.36);
        list.insertEnd("Nimalikani", 10.37);

        list.displayList();

        list.find("Nimali");
        list.find("Nimalii");
    }
}
