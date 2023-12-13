package Collections.Vector;

import java.util.Vector;

/**
 * Vector uses a dynamic array to store the data elements.
 * It is similar to ArrayList.
 * However, It is synchronized and contains many methods that are not the part of Collection framework.
 */
public class VectorEx {
   public static void main(String[] args) {
        Vector<String> stringVector = new Vector<>();

        stringVector.add("Java");
        stringVector.add("Python");
        stringVector.add("C++");
        stringVector.add("Java");

        System.out.println("Element at index 0: " + stringVector.get(0));
        System.out.println("Element at index 1: " + stringVector.get(1));
        System.out.println("Element at index 2: " + stringVector.get(2));

        System.out.println("Last Index of Java:" + stringVector.lastIndexOf("Java"));

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
