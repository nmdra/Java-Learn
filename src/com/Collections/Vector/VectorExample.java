package Collections.Vector;
import java.util.Vector;

/**
 * Example class demonstrating the usage of Vector in Java.
 */
public class VectorExample {
   public static void main(String[] args) {
        // Creating a Vector of String type
        Vector<String> stringVector = new Vector<>();

        // Adding elements to the Vector
        stringVector.add("Java");
        stringVector.add("Python");
        stringVector.add("C++");

        // Accessing elements using index
        System.out.println("Element at index 0: " + stringVector.get(0));
        System.out.println("Element at index 1: " + stringVector.get(1));
        System.out.println("Element at index 2: " + stringVector.get(2));

        // Iterating through the Vector
        System.out.println("\nIterating through the Vector:");
        for (String language : stringVector) {
            System.out.println(language);
        }

        // Checking if an element exists
        String searchLanguage = "Java";
        if (stringVector.contains(searchLanguage)) {
            System.out.println("\n" + searchLanguage + " is present in the Vector.");
        }

        // Removing an element
        stringVector.remove("C++");
        System.out.println("\nVector after removing \"C++\": " + stringVector);

        // Size of the Vector
        System.out.println("\nSize of the Vector: " + stringVector.size());

        // Clearing the Vector
        stringVector.clear();
        System.out.println("Vector after clearing: " + stringVector);
    }
}
