package OOP.AbstractClass;

public class Developer extends Employee{

    public Developer(String name, int employeeId) {
        super(name, employeeId);
    }

    @Override
    public double calculateSalary() {
        return 0;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Position: Developer");
        System.out.println();
    }
}
