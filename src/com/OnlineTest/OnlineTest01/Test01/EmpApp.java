package OnlineTest.OnlineTest01.Test01;

public class EmpApp {
    public static void main(String[] args) {
        PartTimeEmployee emp1 = new PartTimeEmployee("Alice", 20000.00, 7);
        PartTimeEmployee emp2 = new PartTimeEmployee("David", 18000.00, 9);

        emp1.displayEmpInfo();
        emp2.displayEmpInfo();
    }
}
