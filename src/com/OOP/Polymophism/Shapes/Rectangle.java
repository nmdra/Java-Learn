package OOP.Inheritance.Shapes;

// Child Class
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public Rectangle(double side) {
        this.length = side;
        this.width = side;
        super.color = "test";
    }

    public Rectangle(Rectangle rec){
        super();
        this.length = rec.length;
        this.width = rec.width;
    }

    public void calculateArea() {
        System.out.println("Rectangele Area = " + length * width);
    }
}
