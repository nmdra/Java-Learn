package OnlineTest.OnlineTest01.Test01;

public class PartTimeEmployee extends Employee {
    private int OTHours;

    public PartTimeEmployee(String name, double salary, int OTHours) {
        super(name, salary);
        this.OTHours = OTHours;
    }

// for use this method change super class data members to protected.
//    public void displayEmpInfo(){
//        System.out.println("Employee Name: " + name);
//        System.out.println("Employee Salary: " + salary);
//        System.out.println("Employee OTHours: " + OTHours);
//    }

// Method Overriding
//    public void displayInfo(){
//        super.displayInfo();
//        System.out.println("Employee OTHours: " + OTHours + "\n");
//    }

    public void displayEmpInfo(){
        displayInfo();
        System.out.println("Employee OTHours: " + OTHours + "\n");
    }
}

