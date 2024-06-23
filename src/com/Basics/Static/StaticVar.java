package Basics.Static;

public class StaticVar {
    private String stdName;
    private int stdAge;

    static int stdCount = 0;

    public StaticVar(String stdName, int stdAge) {
        this.stdName = stdName;
        this.stdAge = stdAge;
        stdCount++;
    }

    public void printCount(){
        System.out.println(stdCount);
        System.out.println();
    }
}
