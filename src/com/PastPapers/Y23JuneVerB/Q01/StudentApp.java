package PastPapers.Y23JuneVerB.Q01;

import java.util.ArrayList;

public class StudentApp {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();

        Student std1 = new Student("IT111", "Kamal Perera", "Colombo 2", "0771111111");
        Student std = new Student("IT222", "Nimali Herath", "Colombo 3", "0772222222");

        students.add(std);
        students.add(std1);

        Course course = new Course("CS11", "OOP", "Sumali Perera");
        Course course2 = new Course("CS21", "DMS", "Priyal Silva");

        courses.add(course);
        courses.add(course2);

        course.addStudent(std1);
        course.addStudent(std);

        course2.addStudent(std1);

        for (Student student : students) {
            student.Print();
        }

        for(Course c : courses){
            c.Print();
        }


    }
}
