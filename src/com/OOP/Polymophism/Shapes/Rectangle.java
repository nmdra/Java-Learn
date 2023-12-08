package OOP.Polymophism.Shapes;

// Child Class
class Rectangle extends Shape {
    protected double length;
    protected double width;

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
        System.out.println("Rectangle Area = " + length * width);
    }

//    Wrong: Return type doesn't match.
//    static int getShapes(){
//        return shapeCount;
//    }

    public int shapeC(){
        return shapeCount;
//      return super.shapeCount; // also works, Not Recommended.
//      return this.shapeCount; // also works, Not Recommended.
    }

}
