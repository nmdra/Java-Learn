package OnlineTest.VersionG;

import java.util.Scanner;
public class Employee
{
    String Empid;
    String name;
    String address;

    public Employee()
    {

    }

    public Employee(String Empid, String name, String address)
    {
        this.Empid= Empid;
        this.name = name;
        this.address = address;
    }
    public void Read()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the EID: ");
        this.Empid = sc.next();

        System.out.print("Enter the name: ");
        this.name = sc.next();

        System.out.print("Enter the Address: ");
        this.address = sc.next();
    }
    public void Print()
    {
        System.out.println("Employee ID : "+this.Empid);
        System.out.println("Employee name : "+this.name);
        System.out.println("Employee address : "+this.address);
    }
}
