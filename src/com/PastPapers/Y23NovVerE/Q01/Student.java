package PastPapers.Y23NovVerE.Q01;

import java.util.ArrayList;

public class Student extends Person{
    ArrayList<Course> enrolledCourse;

    public Student(){
        super();
        enrolledCourse = new ArrayList<>();
    }

    public Student(int ID, String name) {
        super(ID, name);
        enrolledCourse = new ArrayList<>();
    }

    public void EnrollInCourse(Course c){
        enrolledCourse.add(c);
    }

    @Override
    void DisplayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + ID);
        System.out.println("Enrolled Courses: ");
        enrolledCourse.forEach(course -> System.out.println(course.courseName));
    }

}
