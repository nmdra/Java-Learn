package DataStructures.LinkedList.Quiz;

public class LinkX {
    public String name;
    public double average;
    public LinkX next;

    public LinkX(String name, double average) {
        this.name = name;
        this.average = average;
        this.next = null;
    }

    public void displayDetails() {
        System.out.print("Name: " + name + " ");
        System.out.println("Average: " + average);
    }
}
