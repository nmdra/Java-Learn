package PastPapers.Y23JuneVerB.Q01;

import java.util.ArrayList;
import java.util.Scanner;

public class Course {
    String CourseId;
    String name;
    String instructor;

    ArrayList<Student> enrolledStudents = new ArrayList<>();

    public Course(String courseId, String name, String instructor) {
        CourseId = courseId;
        this.name = name;
        this.instructor = instructor;
    }

    public void Read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Course ID: "+CourseId);
        this.CourseId = sc.nextLine();

        System.out.println("Name: "+name);
        this.name = sc.nextLine();

        System.out.println("Instructor: "+instructor);
        this.instructor =  sc.nextLine();
    }

    public void Print(){
        System.out.println();
        System.out.println("Course ID: "+CourseId);
        System.out.println("Name: "+name);
        System.out.println("Instructor: "+instructor);

        System.out.println("Enrolled Student: ");
        for(Student student : enrolledStudents){
            System.out.println("\t" + student.getName());
        }

        System.out.println();
    }

    public void addStudent(Student student){
        enrolledStudents.add(student);
    }
}
