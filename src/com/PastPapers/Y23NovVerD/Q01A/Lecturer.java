package PastPapers.Y23NovVerD.Q01A;

public class Lecturer implements IPerson {
   String employeeId;
   String department;

    public Lecturer(String employeeId, String department) {
        this.employeeId = employeeId;
        this.department = department;
    }

    @Override
    public String displayDetails() {
        return "Lecturer: " + employeeId + ", Department: " + department;
    }
}
