package PastPapers.Y22NovVerA.Q01;

public class PermanentEmp extends Employee{
	private double basic;
	private double commision;
	
	double NetSalary;
	
	public PermanentEmp(int id, String name,double basic) {
		super(id, name);
		this.basic = basic;
		this.commision = this.basic * 0.15 ;
	}

	@Override
	public void calculateNesSalary() {
		NetSalary = basic + commision ;
		
	}
	
	public void display() {
		super.display();
		System.out.println("Basic Salary : " + basic);
		System.out.println("Commission : " + commision);
		System.out.println("Net Salary : " + NetSalary);
		System.out.println();
	}
}
