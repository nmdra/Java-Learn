package PastPapers.Y22NovVerB.Q02;

public class Employee<T1, T2> {
    private T1 name;
    private T2 empId;

    public Employee(T1 name, T2 empId) {
        this.name = name;
        this.empId = empId;
    }

    public T2 getEmpId() {
        return empId;
    }
}
