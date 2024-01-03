package LabEx.DesignPatterns.AbstractFactory;

public class Test {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape("SQUARE");
        shape.draw();
    }
}
