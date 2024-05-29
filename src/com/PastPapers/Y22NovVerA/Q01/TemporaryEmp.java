package PastPapers.Y22NovVerA.Q01;

public class TemporaryEmp extends Employee {
	private int OtHrs;
	private double OtRate;
	private double minWage;
	double NetSalary ;
	
	public TemporaryEmp() {}
	
	public TemporaryEmp(int id, String name,int otHrs, double otRate) {
		super(id, name);
		OtHrs = otHrs;
		OtRate = otRate;
		this.minWage = 15000.00 ;
	}

	@Override
	public void calculateNesSalary() {
		NetSalary = minWage + (OtHrs * OtRate);
	}
	
	public void display() {
		super.display();
		System.out.println("Minimum Wage = " + minWage);
		System.out.println("Net Salary : " + NetSalary);
		System.out.println();
	}

}
