package PastPapers.Y23NovVerE.Q02B;

public class MainApp {
    public static void main(String[] args) {
        Pair<String,Integer> pair=new Pair<>("Test 1",42);

        Pair<Double,String> pair2=new Pair<>(3.14,"Test 2");

        System.out.println("Printing First Pair ");
        System.out.println("First value: " + pair.getFirst());
        System.out.println("Second value: " + pair.getSecond());

        System.out.println();

        System.out.println("Printing Second Pair ");
        System.out.println("First value: " + pair2.getFirst());
        System.out.println("Second value: " + pair2.getSecond());
    }
}
