package LabEx.Collections;

import java.util.HashMap;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        HashMap<Integer, Student> stds = new HashMap<>();

        stds.put(1,new Student(1, "Amuka", 3.5));
        stds.put(2,new Student(2, "Dumuka", 2.5));
        stds.put(3,new Student(3, "Amal", 2.5));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student ID to access details: ");

        Student selectedStudent = stds.get(scanner.nextInt());

        if (selectedStudent != null) {
            System.out.println("Details of Student");
            selectedStudent.displayDetails();
        } else {
            System.out.println("Student ID not found.");
        }

        System.out.println("All Students:");
        stds.forEach((x,y) -> System.out.println(y.getStdId() + " = " + y.getStdName()));

        System.out.println("Students Count: " + Student.getStdCount());
    }
}
