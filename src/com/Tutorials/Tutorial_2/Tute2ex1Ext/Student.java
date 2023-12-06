package Tutorials.Tutorial_2.Tute2ex1Ext;

public class Student {
    private String name;
    private String stdID;
    private int mark_1, mark_2, mark_3;
    private float avg = 0;

    Student(){
        mark_1 = 0;
        mark_2 = 0;
        mark_3 = 0;
        name = "";
        stdID = "";
    }

    Student(String stdID, String name){
        this.stdID = stdID;
        this.name = name;
    }

    public void setMarks(int mark_1, int mark_2, int mark_3) {
        this.mark_1 = mark_1;
        this.mark_2 = mark_2;
        this.mark_3 = mark_3;
        calcAvg();
    }

    public void calcAvg() {
        avg = ((float) (mark_1 + mark_2 + mark_3) / 3);
    }

    public void printDetails() {
        System.out.println("Student ID: " + stdID);
        System.out.println("Name: " + name);
        System.out.println("Average Marks: " + String.format("%.2f", avg));
    }
}
