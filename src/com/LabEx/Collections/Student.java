package LabEx.Collections;

public class Student {
    private int stdId;
    private String stdName;
    private double gpa;
    static private int stdCount = 0;

    public Student(int stdId, String stdName, double gpa) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.gpa = gpa;
        stdCount++;
    }

    public void displayDetails() {
        System.out.println("Student ID : " + stdId);
        System.out.println("Student Name: " + stdName);
        System.out.println("GPA: " + gpa);
        System.out.println();
    }

    public int getStdId() {
        return stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public static int getStdCount() {
        return stdCount;
    }

}
