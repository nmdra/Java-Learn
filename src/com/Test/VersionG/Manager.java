package Test.VersionG;

import java.util.Scanner;

public class Manager extends Employee
{
    int ProductNo1;
    int ProductNo2;
    int ProductNo3;
    String Department;

    public Manager()
    {

    }

    public Manager(String Empid, String name, String address, int ProductNo1, int ProductNo2, int ProductNo3, String Department)
    {
        super(Empid,name,address);
        this.ProductNo1 = ProductNo1;
        this.ProductNo2 = ProductNo2;
        this.ProductNo3 = ProductNo3;
        this.Department = Department;
    }

    public void Read()
    {
        super.Read();
        Scanner sc = new Scanner(System.in);

        try
        {

            System.out.print("Enter Department : ");
            this.Department= sc.next();

            System.out.print("Enter Product No 1 : ");
            this.ProductNo1 = sc.nextInt();

            System.out.print("Enter Product No 2 : ");
            this.ProductNo2 = sc.nextInt();

            System.out.print("Enter Product No 3 : ");
            this.ProductNo3 = sc.nextInt();
        }
        catch(Exception ex1)
        {
            System.out.println(ex1);
        }

    }

    public void Print()
    {
        super.Print();

        System.out.println("Department : "+this.Department);
        System.out.println("ProductNo1 : "+this.ProductNo1);
        System.out.println("ProductNo2 : "+this.ProductNo2);
        System.out.println("ProductNo3 : "+this.ProductNo3);
    }

}

