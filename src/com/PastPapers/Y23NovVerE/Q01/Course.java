package PastPapers.Y23NovVerE.Q01;

public abstract class Course {
    String code;
    String courseName;

    public Course(){
        this.code = "";
        this.courseName = "";
    }

    public Course(String code, String courseName) {
        this.code = code;
        this.courseName = courseName;
    }

    public abstract void DisplayCourseDetails();
}
