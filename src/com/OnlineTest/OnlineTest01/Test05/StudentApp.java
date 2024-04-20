package OnlineTest.OnlineTest01.Test05;

public class StudentApp{
    public static void main(String[] args) {
       Course course1 = new Course("Kevin Hart", 35, "Java Programming");
       Course course2 = new Course("George Carline", 60, "C++ Programming");

       course1.displayCourseInfo();
       course2.displayCourseInfo();
    }
}
