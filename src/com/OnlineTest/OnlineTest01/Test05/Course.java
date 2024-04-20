package OnlineTest.OnlineTest01.Test05;

public class Course extends Student{
    private String courseName;

    public Course(String name, int age, String courseName) {
        super(name, age);
        this.courseName = courseName;
    }

    public void displayCourseInfo(){
        displayInfo();
        System.out.println("Course Name: " + courseName +"\n");
    }

}

