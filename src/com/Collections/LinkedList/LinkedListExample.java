package Collections.LinkedList;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C++");
        linkedList.add("JavaScript");

        // Displaying the elements of the LinkedList
        System.out.println("LinkedList Elements: " + linkedList);

        // Adding an element at the beginning
        linkedList.addFirst("C#");

        // Adding an element at the end
        linkedList.addLast("Ruby");

        // Displaying the updated elements of the LinkedList
        System.out.println("Updated LinkedList Elements: " + linkedList);

        // Accessing elements by index
        System.out.println("Element at index 2: " + linkedList.get(2));

        // Removing an element by value
        linkedList.remove("C++");

        // Displaying the final elements of the LinkedList
        System.out.println("Final LinkedList Elements: " + linkedList);
    }
}
