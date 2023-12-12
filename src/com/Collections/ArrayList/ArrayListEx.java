package Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * This class demonstrates the usage of ArrayList in Java.
 * ArrayList is a resizable-array implementation of the List interface.
 */
public class ArrayListEx {

    /**
     * The main method is the entry point of the program.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        List<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Displaying the original list
        System.out.println("Original List: " + fruits);

        // Adding an element at a specific index
        fruits.add(2, "Grapes");

        // Displaying the modified list
        System.out.println("Modified List: " + fruits);

        // Accessing elements by index
        String thirdFruit = fruits.get(2);
        System.out.println("The fruit at index 2: " + thirdFruit);

        // Checking if the list contains a specific element
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Contains Banana? " + containsBanana);

        // Removing an element by value
        boolean removed = fruits.remove("Orange");
        System.out.println("Removed Orange? " + removed);
        System.out.println("Updated List: " + fruits);

        // Getting the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of the List: " + size);

        // Clearing all elements from the ArrayList
        fruits.clear();
        System.out.println("Cleared List: " + fruits);
    }
}
