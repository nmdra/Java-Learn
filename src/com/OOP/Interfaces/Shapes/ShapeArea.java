package OOP.Interfaces.Shapes;

import java.util.Scanner;

public class ShapeArea extends GetInput implements Area {

    @Override
    public void circle(int r) {

        double areaOfCircle = 3.142 * r * r;

        System.out.println("Area of the circle is " + areaOfCircle);

    }

    @Override
    public void square(int s) {
        double areaOfSquare = s * s;

        System.out.println("Area of the square is " + areaOfSquare);

    }

    @Override
    public void rectangle() {

        Scanner kb3 = new Scanner(System.in);

        System.out.println("Enter the length of the Rectangle");

        double l = kb3.nextInt();

        System.out.println("Enter the breadth of the Rectangle");

        double b = kb3.nextInt();

        double areaOfRectangle = l * b;

        System.out.println("Area of the Rectangle is " + areaOfRectangle);

    }

    @Override
    public void triangle() {

        Scanner kb4 = new Scanner(System.in);

        System.out.println("Enter the base of the Triangle");

        double base = kb4.nextInt();

        System.out.println("Enter the height of the Triangle");

        double h = kb4.nextInt();

        double areaOfTriangle = 0.5 * base * h;

        System.out.println("Area of the Triangle is " + areaOfTriangle);

    }

    @Override
    public int squareInput() {
        Scanner kb2 = new Scanner(System.in);

        System.out.println("Enter the Side of the Square: ");

        return kb2.nextInt();
    }

    @Override
    public int circleInput() {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");

        return kb.nextInt();
    }
}
