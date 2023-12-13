package LabEx.Collections;

import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<Student> stdArr = new ArrayList<>();

        stdArr.add(new Student(1, "Amuka", 3.5));
        stdArr.add(new Student(2, "Dumuka", 2.5));
        stdArr.add(new Student(3, "Amal", 2.5));

        for(Student std : stdArr){
            std.displayDetails();
        }

        System.out.println("Student Count: " + Student.getStdCount() );
    }
}
