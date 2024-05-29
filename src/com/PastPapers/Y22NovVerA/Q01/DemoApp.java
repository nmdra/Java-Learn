package PastPapers.Y22NovVerA.Q01;

import java.util.ArrayList;

public class DemoApp {

	public static void main(String[] args) {
		ArrayList<PermanentEmp> pemp = new ArrayList<>();
		
		PermanentEmp emp1 = new PermanentEmp(1,"kamal",2000.0);
		PermanentEmp emp2 = new PermanentEmp(2,"nimal", 30000.0);
		
		pemp.add(emp1);
		pemp.add(emp2);
		
		for(PermanentEmp emp : pemp) {
			emp.calculateNesSalary();
			emp.display();
		}
		
        ArrayList<TemporaryEmp> temp = new ArrayList<>();
		
        TemporaryEmp emp3 = new TemporaryEmp(1,"kamal",10 , 15.0);
        TemporaryEmp emp4 = new TemporaryEmp(2,"nimal", 20, 24.5);
		
		temp.add(emp3);
		temp.add(emp4);
		
		for(TemporaryEmp emp : temp) {
			emp.calculateNesSalary();
			emp.display();
		}

	}

}
