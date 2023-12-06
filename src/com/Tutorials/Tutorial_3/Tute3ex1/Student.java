package Tutorials.Tutorial_3.Tute3ex1;

public class Student {
    private int studentID;
    private String name;
    private String degree;
    private String mobile;
    static private int max = 100;

    // Default Constructor
    Student(){
        name = null;
        degree = null;
        mobile = null;
        studentID = max++;
    };

    // Parameterized Constructor
    Student(String name, String degree, String mobile){
        this.name = name;
        this.degree = degree;
        this.mobile = mobile;
        studentID = max++;
    }

    public void setDetails(String name, String degree, String mobile){
        this.name = name;
        this.degree = degree;
        this.mobile = mobile;
    }

    public static int getNextStudentID(){
        return max;
    }

    public void print(){
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Degree: " + degree);
        System.out.println("Student mobile: " + mobile);
    }

    // Setters and Getters
/*    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }*/
}
