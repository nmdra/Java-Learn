package OOP.Generics.Examples.WildCards;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcardExample {
    public static void main(String[] args) {
        List<? super Integer> numbers = new ArrayList<>();
        // The list can hold Integer or any super type of Integer (e.g., Number, Object)

        numbers.add(10);
        numbers.add(20);
        // The list can accept Integer or any sub-type of Integer

        Object obj = numbers.get(0); // OK
        System.out.println(obj);

        // Compilation error: int value = numbers.get(0);
        // Compilation error: double value = numbers.get(0);

        // Allows adding elements of type Integer or any sub-type of Integer, but reading as Object.
    }
}
