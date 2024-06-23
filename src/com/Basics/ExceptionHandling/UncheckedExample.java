package Basics.ExceptionHandling;

public class UncheckedExample {

    // This method has an unchecked exception, so it doesn't need 'throws'
    private static double divideNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
//            throw new ArithmeticException();
        }
        return (double) numerator / denominator;
    }

    public static void main(String[] args) {
        try {
            double result = divideNumbers(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}

// https://www.javatpoint.com/difference-between-throw-and-throws-in-java
