package PastPapers.Y23JuneVerB.Q01;

import java.util.Scanner;

public class Student {
    private String StudentId;
    private String name;
    private String address;
    private String contact_number;

    public Student(String studentId, String name, String address, String contact_number) {
        StudentId = studentId;
        this.name = name;
        this.address = address;
        this.contact_number = contact_number;
    }

    public void Read() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Student Information:");

        System.out.print("Student ID is: ");
        this.StudentId = sc.next();

        System.out.println("Student Name is: ");
        this.name = sc.next();

        System.out.println("Student Address is: ");
        this.address = sc.next();

        System.out.println("Student Telephone is: ");
        this.contact_number = sc.next();

        sc.close();

    }

    public void Print(){
        System.out.println();
        System.out.println("Student ID: "+StudentId);
        System.out.println("Student Name: "+name);
        System.out.println("Student Address: "+address);
        System.out.println("Student Telephone Number: "+contact_number);

        System.out.println();
    }

    public String getName() {
        return name;
    }
}
