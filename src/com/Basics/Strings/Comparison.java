package Basics.Strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "Kunal";
        String b = a;
        System.out.println(a == b); // True: same reference Object

        String name1 = new String("Kunal");
        String name2 = new String("Kunal");

        System.out.println(name1 == name2); // False: Different object

        System.out.println(name1.equals(name2)); // check value of object

    }
}
