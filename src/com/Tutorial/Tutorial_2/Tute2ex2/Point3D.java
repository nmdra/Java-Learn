package Tutorial.Tutorial_2.Tute2ex2;

class Point3D {
    private float x;
    private float y;
    private float z;

    // Constructor to initialize the coordinates
    public Point3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Method to calculate the distance from the origin to the point
    public float distance() {
        return (float) Math.sqrt(x * x + y * y + z * z);
    }
}

