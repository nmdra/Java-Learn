package PastPapers.Y23NovVerE.Q01;

import java.util.ArrayList;

public class Teacher extends Person {
    ArrayList<Course> coursesTaught;

    public Teacher(int ID, String name) {
        super(ID, name);
        coursesTaught = new ArrayList<>();
    }

    public Teacher(){
        super();
        coursesTaught = new ArrayList<>();
    }

    @Override
    void DisplayDetails() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Teacher ID: " + ID);
        System.out.println("Taught Courses: ");
        coursesTaught.forEach(course -> System.out.println("\t" + course.courseName));
    }

    void TeachCourse(Course c){
        this.coursesTaught.add(c);
    }

}
