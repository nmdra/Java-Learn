package OOP.AbstractClass;

public abstract class Employee {
    protected String name;
    protected int employeeId;

    protected static int empCount;

    public Employee(String name, int employeeId){
        this.name = name;
        this.employeeId = employeeId;
    }

    static void test(){
        System.out.println("test");
    }

    public abstract double calculateSalary();
    public abstract void displayDetails();
}
