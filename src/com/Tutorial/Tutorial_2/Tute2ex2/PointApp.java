package Tutorial.Tutorial_2.Tute2ex2;

import java.util.Scanner;

public class PointApp {
    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Get coordinates for the first point
        System.out.print("Enter x coordinate for Point 1: ");
        float x1 = scanner.nextFloat();
        System.out.print("Enter y coordinate for Point 1: ");
        float y1 = scanner.nextFloat();
        System.out.print("Enter z coordinate for Point 1: ");
        float z1 = scanner.nextFloat();

        // Get coordinates for the second point
        System.out.print("Enter x coordinate for Point 2: ");
        float x2 = scanner.nextFloat();
        System.out.print("Enter y coordinate for Point 2: ");
        float y2 = scanner.nextFloat();
        System.out.print("Enter z coordinate for Point 2: ");
        float z2 = scanner.nextFloat();

        // Create Point3D objects
        Point3D point1 = new Point3D(x1, y1, z1);
        Point3D point2 = new Point3D(x2, y2, z2);

        // Calculate and display the distance to the origin for each point
        System.out.println("Distance from Point 1 to the origin: " + point1.distance());
        System.out.println("Distance from Point 2 to the origin: " + point2.distance());

        // Close the scanner
        scanner.close();
    }
}


