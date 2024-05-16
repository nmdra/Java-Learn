package PastPapers.Y23NovVerE.Q01;


public  class ConcreateCourse extends Course {

    public ConcreateCourse(String code, String name) {
        super(code, name);
    }

    @Override
    public void DisplayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code:" + code);
    }
}
