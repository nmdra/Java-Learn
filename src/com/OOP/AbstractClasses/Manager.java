package OOP.AbstractClass;

public class Manager extends Employee {
    public Manager(String name, int employeeId) {
        super(name, employeeId);
        test(); // call static method
    }

    @Override
    public double calculateSalary() {
        return 0;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + super.name);
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Position: Manager");
        System.out.println();
    }
}
