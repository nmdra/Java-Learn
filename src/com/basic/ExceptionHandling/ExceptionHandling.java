package basic.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get input from the user
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // Perform division
            double result = divideNumbers(numerator, denominator);

            // Display the result
            System.out.println("Result of division: " + result);
        }
        catch (ArithmeticException e) {
            // Handle division by zero exception
            System.out.println("Error: Division by zero is not allowed.\n" + e.getMessage());
        }
        catch (InputMismatchException e) {
            // Handle Input mismatch
            System.out.println("Error: Input Mismatch.\n" + e);
        }
        catch (Exception e) {
            // Handle other exceptions
            System.out.println("An unexpected error occurred:\n" + e);
        }
        finally {
            // Close the scanner to prevent resource leak
            scanner.close();
        }
    }

    private static double divideNumbers(int numerator, int denominator) {
        // Check if the denominator is zero
        if (denominator == 0) {
            // If so, throw an ArithmeticException
            throw new ArithmeticException("Cannot divide by zero.");
        }

        // Perform the division
        return (double) numerator / denominator;
    }
}
