package PastPapers.Y22NovVerA.Q01;

public abstract class Employee {
	
	private int id;
	private String name;
	
	public Employee() {}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		
		System.out.println("Employee ID : " + id);
		System.out.println("Employee Name : " + name);
	}
	
	public abstract void calculateNesSalary();

}
