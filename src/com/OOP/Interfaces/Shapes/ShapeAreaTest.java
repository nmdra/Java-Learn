package OOP.Interfaces.Shapes;

public class ShapeAreaTest {
    public static void main(String[] args) {

        ShapeArea geometry = new ShapeArea();

        geometry.circle(geometry.circleInput());

        geometry.square(geometry.squareInput());

        geometry.rectangle();

        geometry.triangle();

        System.out.println(geometry.test);

    }
}
