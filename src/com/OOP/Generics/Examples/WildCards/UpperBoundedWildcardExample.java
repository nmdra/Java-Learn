package OOP.Generics.Examples.WildCards;

import java.util.ArrayList;
import java.util.List;

class Fruit {
    void eat() {
        System.out.println("Eating fruit");
    }
}

class Apple extends Fruit {
    void peel() {
        System.out.println("Peeling apple");
    }
}

class Orange extends Fruit {
    void squeeze() {
        System.out.println("Squeezing orange");
    }
}

public class UpperBoundedWildcardExample {
    public static void main(String[] args) {
        List<? extends Fruit> fruits = new ArrayList<>();
        // The list can hold Fruit, Apple, or Orange instances

        Fruit fruit = fruits.get(0); // OK
        fruit.eat();

        // Compilation error: fruits.add(new Apple());
        // fruits.add(new Orange());

        // However, it allows reading from the list but not writing (adding elements).
    }
}
