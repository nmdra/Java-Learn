package OOP.AbstractClass;

class EmployeeApp {
    public static void main(String[] args) {
        Manager manager = new Manager("Thorfinn", 99);
        manager.calculateSalary();
        manager.displayDetails();

        Developer dev = new Developer("Einar", 100);
        dev.calculateSalary();
        dev.displayDetails();

        Employee developer;  // Object can be data type
        // new Employee("Leif", 101); <-- cant create object using abstract Class
        developer = new Developer("Leif", 101);

        developer.calculateSalary();
        developer.displayDetails();
    }
}