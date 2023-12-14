package basic.ExceptionHandling;

import java.io.IOException;

public class UncheckedExample {

    // This method has an unchecked exception, so it doesn't need 'throws'
    private static double divideNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return (double) numerator / denominator;
    }

    public static void main(String[] args) {
        double result = divideNumbers(10, 0); // No need for try-catch or 'throws'
        System.out.println("Result: " + result);
    }
}
