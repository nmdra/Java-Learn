package Basics.Static;

public class StaticExampleDemo {
    public static void main(String[] args) {
        StaticVar st1 = new StaticVar("Amal", 10);

        st1.printCount();

        StaticVar st2 = new StaticVar("Amal", 10);

        System.out.println(StaticVar.stdCount);
    }
}
