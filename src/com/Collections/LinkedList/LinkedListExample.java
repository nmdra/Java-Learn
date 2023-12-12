package Collections.LinkedList;

import java.util.LinkedList;
import java.util.List;

/**
 * <h3>The {@code ArrayList} with {@code ArrayDeque} is often preferred in many use-cases over {@code LinkedList}.
 * If uncertain, it is recommended to start with {@code ArrayList}.</h3>
 *
 * <p><b>Summary:</b> In {@code ArrayList}, accessing an element takes constant time [O(1)], while adding an element
 * takes O(n) time in the worst case. On the other hand, in {@code LinkedList}, inserting an element and accessing
 * an element both take O(n) time, but {@code LinkedList} tends to use more memory than {@code ArrayList}.
 *
 * <p>{@code LinkedList} and {@code ArrayList} are two different implementations of the {@code List} interface.
 * {@code LinkedList} uses a doubly-linked list, while {@code ArrayList} uses a dynamically re-sizing array.
 *
 * <p>For more details, refer to <a href="https://stackoverflow.com/a/322742"> this Link</a>.
 */

public class LinkedListExample {

    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        LinkedList<Double> linkedList1 = new LinkedList<>(List.of(1.11));

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

        linkedList1.forEach(System.out::print); // Method Reference
    }
}
