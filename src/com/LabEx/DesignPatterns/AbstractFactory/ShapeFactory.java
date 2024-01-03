package LabEx.DesignPatterns.AbstractFactory;

public class ShapeFactory {
    Shape  getShape(String s){
        if (s == "SQUARE") {
            return new Square();
            }
        return null;
    }
}
