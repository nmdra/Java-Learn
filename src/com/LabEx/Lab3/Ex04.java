package LabEx.Lab3;

class Student{
    String name;
    String ditno;
    String address;

    public Student() {
    }

    public Student(String name, String ditno, String address) {
        this.name = name;
        this.ditno = ditno;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDitno(String ditno) {
        this.ditno = ditno;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("DIT No: " + ditno);
        System.out.println("Address: " + address);
    }

    String getName(){
        return name;
    }

    String getAddress(){
        return address;
    }

    String getDit(){
        return ditno;
    }

    String getDetails(){
        return "I am Student.\nMy name is " + name + ".\nI am from " + address + ".\nMy dit no is " + ditno + ".";
    }
}

public class Ex04 {
    public static void main(String[] args) {
        Student student1 = new Student("Name", "123", "123 Main St");
        Student student2 = new Student();

        student2.setDitno("234");
        student2.setName("OnlineTest");
        student2.setAddress("Colombo");

        System.out.println(student1.getName());
        System.out.println(student1.getAddress());
        System.out.println(student1.getDit());

        System.out.println(student1.getDetails());
    }
}