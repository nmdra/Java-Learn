package OOP.Generics.Examples.WildCards;

import java.util.ArrayList;
import java.util.List;

/**
 * The {@code WildCard} class demonstrates the use of wildcard in Java generics
 * to create a method that can accept a list of objects of a specific type and its subclasses.
 * It includes an abstract class {@code Shape} and its subclasses {@code Rectangle} and {@code Circle}
 * to represent different shapes.
 *
 * @author Nimendra
 * @since 2023-12-02
 */

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class WildCard {
    public static void main(String[] args) {
        List<Rectangle> list1 = new ArrayList<>();
        list1.add(new Rectangle());

        List<Circle> list2 = new ArrayList<>();
        list2.add(new Circle());
        list2.add(new Circle());
        list2.add(new Circle());

        drawShapes(list1);
        System.out.println();
        drawShapes(list2);
    }

    /**
     * Draws shapes from the given list using a wildcard to accept any type
     * that extends the {@code Shape} class.
     *
     * @param lists A list of shapes or its subclasses.
     */
    public static void drawShapes(List<? extends Shape> lists) {
        for (Shape s : lists) {
            s.draw();
        }
    }
}
