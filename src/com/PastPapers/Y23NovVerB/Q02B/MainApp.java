package PastPapers.Y23NovVerB.Q02B;

public class MainApp {
    public static void main(String[] args) {

        GenericCalculator genCalculator = new GenericCalculator();
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};

        System.out.println("Maximum Integer: " + genCalculator.calculateMaximum(intArray));
        System.out.println("Product of Integer Array: " + genCalculator.calculateProduct(intArray));

        System.out.println("Maximum Double: " + genCalculator.calculateMaximum(doubleArray));
        System.out.println("Product of Double Array: " + genCalculator.calculateProduct(doubleArray));

        // For Testing
        Long[] longArray = {10L, 20L, 30L, 40L, 50L};
        System.out.println("Maximum Long: " + genCalculator.calculateMaximum(longArray));
        System.out.println("Product of Long Array: " + genCalculator.calculateProduct(longArray));
    }
}
