package PastPapers.Y23NovVerE.Q01;

public class InstitutionManagementApp {
    public static void main(String[] args) {


        Course OOP = new ConcreateCourse("1234","OOP");
        Course DMS = new ConcreateCourse("2345", "DMS");


        Student std1 = new Student(1234,"Bruno");

        std1.EnrollInCourse(OOP);
        std1.EnrollInCourse(DMS);

        std1.DisplayDetails();

        System.out.println("-------------------");

        Teacher teacher1 = new Teacher(9999, "Hasalaka");
        teacher1.TeachCourse(OOP);

        teacher1.DisplayDetails();

    }
}
