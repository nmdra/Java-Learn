package Collections.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Mango");

        System.out.println("HashSet elements: " + hashSet);

        // Removing an element
        hashSet.remove("Banana");
        System.out.println("After removing 'Banana': " + hashSet);

        // Checking if an element exists
        boolean containsMango = hashSet.contains("Mango");
        System.out.println("Does HashSet contain 'Mango'? " + containsMango);

        // Iterating through the HashSet using Iterator
        Iterator<String> iterator = hashSet.iterator();
        System.out.println("Iterating through HashSet using Iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Size of the HashSet
        int size = hashSet.size();
        System.out.println("Size of HashSet: " + size);

        // Clearing the HashSet
        hashSet.clear();
        System.out.println("HashSet after clearing: " + hashSet);
    }
}
