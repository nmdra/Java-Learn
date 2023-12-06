package OOP.Polymophism.Shapes;

// Base class
class Shape {
    // Common properties for all shapes
    protected String color;
    protected static int shapeCount = 0;

    public Shape() {
        this.color = null;
        shapeCount++;
    }

    // Constructor Overloading
    public Shape(String color) {
        this.color = color;
        shapeCount++;
    }

    // Common method for all shapes
    public void draw() {
        System.out.println("Drawing a shape with color: " + color);
    }

    public void draw(String str) {
        System.out.println(str + " " + color);
    }

 // Wrong : method overloading is based on the method signature,
 //       which includes the method name and the parameter types.
 //       The return type alone does not differentiate overloaded methods.
 //   public int draw() {
 //       return 1;
 //   }

    public int draw(int test) {
        return 1;
    }

    static void getShapes(){
        System.out.println("Shape Count = " + shapeCount);
    }

    static void getShapes(String strng){
        System.out.println(strng + " " + shapeCount);
    }

}

