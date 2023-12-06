package OOP.Polymophism.Shapes;

class Eclipse extends Circle {
    private double semiMajorAxis;

    public Eclipse(double radius, double semiMajorAxis) {
        super(radius);
        this.semiMajorAxis = semiMajorAxis;
    }

    // Method Overriding
    @Override
    public void calculateArea() {
        System.out.println("Eclipse Area = " + Math.PI * radius * semiMajorAxis);
    }
}
