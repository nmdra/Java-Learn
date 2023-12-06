package OOP.Polymophism.Shapes;

public class shapeTest {
    public static void main(String[] args) {
        // Create instances of Circle and Rectangle
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);
        Square sq = new Square(10.0);

        Rectangle rectangle1 = new Rectangle(rectangle);

        Circle eclipse = new Eclipse(circle.radius, 10.0); // Upcasting

        // Call common method from base class
        circle.draw(); // Red
        rectangle.draw(); // Blue
        sq.draw(); // test
        rectangle1.draw(); // null
        eclipse.draw("Eclipse Color"); // null

        // Call specific methods from derived classes
        circle.calculateArea();
        rectangle.calculateArea();
        sq.calculateArea();
        rectangle1.calculateArea();
        eclipse.calculateArea();


        Shape.getShapes();
    }




}
