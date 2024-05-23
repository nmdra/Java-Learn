package PastPapers.Y23NovVerD.Q01A;

public class Student implements IPerson {
    String studentId;
    int grade;

    public Student(String studentId, int grade) {
        this.studentId = studentId;
        this.grade = grade;
    }

    @Override
    public String  displayDetails() {
        return "Student = " + studentId+", Grade = "+grade;
    }
}
