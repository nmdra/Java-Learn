package OOP.Inheritance.Shapes;

class Eclipse extends Circle {
    private double semiMajorAxis;

    public Eclipse(double radius, double semiMajorAxis) {
        super(radius);
        this.semiMajorAxis = semiMajorAxis;
    }

    // Method to calculate area (overrides the method in the base class)
    @Override
    public void calculateArea() {
        System.out.println("Eclipse Area = " + Math.PI * radius * semiMajorAxis);
    }
}
