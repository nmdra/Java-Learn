package OOP.Inheritance.Shapes;

// Derived class - Circle
class Circle extends Shape {

    protected double radius;

    // Constructor
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    // final public void calculateArea() {  <-- Stop overriding
    public void calculateArea(){
        System.out.println("Circle Area = " + Math.PI * radius * radius);
    }
}
