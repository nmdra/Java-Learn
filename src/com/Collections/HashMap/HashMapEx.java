package Collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Java", 20);
        hashMap.put("Python", 15);
        hashMap.put("JavaScript", 25);
        hashMap.put("C++", 18);

        System.out.println("HashMap: " + hashMap);

        // Accessing the value using the key
        int javaScore = hashMap.get("Java");
        System.out.println("Java's score: " + javaScore);

        // Checking if a key exists
        boolean containsPython = hashMap.containsKey("Python");
        System.out.println("Does HashMap contain 'Python'? " + containsPython);

        // Updating the value associated with a key
        hashMap.put("Java", 22);
        System.out.println("Updated HashMap: " + hashMap);

        // Removing a key-value pair
        hashMap.remove("JavaScript");
        System.out.println("HashMap after removing 'JavaScript': " + hashMap);

        // Iterating through the HashMap using entrySet
        System.out.println("Iterating through HashMap using entrySet:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Size of the HashMap
        int size = hashMap.size();
        System.out.println("Size of HashMap: " + size);

        // Clearing the HashMap
        hashMap.clear();
        System.out.println("HashMap after clearing: " + hashMap);
    }
}
