package OOP.Inheritance.Shapes;

// Base class
class Shape {
    // Common properties for all shapes
    protected String color;
    protected static int shapeCount = 0;

    public Shape() {
        this.color = null;
        shapeCount++;
    }

    public Shape(String color) {
        this.color = color;
        shapeCount++;
    }

    // Common method for all shapes
    public void draw() {
        System.out.println("Drawing a shape with color: " + color);
    }

    static void getShapes(){
        System.out.println("Shape Count = " + shapeCount);
    }


}

