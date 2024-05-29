package PastPapers.Y23NovVerB.Q02A;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeNames {
    public static void main(String[] args) {
        ArrayList<String> employees=new ArrayList<>();

        Scanner sc =new Scanner(System.in);

        while(true){
            System.out.print("Enter Employee Name: ");
            String empName=sc.nextLine();
            if(empName.equals("done")) break;
            employees.add(empName);
        }

        System.out.print("Enter Name To Remove: ");

        String toRemove=sc.nextLine();

        if(employees.contains(toRemove)){
            employees.remove(toRemove);
            System.out.println(toRemove + " was Successfully Removed");
        } else {
            System.out.println(toRemove + " was not found");
        }

        System.out.println("Total no. Of Employees: "+employees.size());

        employees.forEach(x -> System.out.println(x));

    }
}
