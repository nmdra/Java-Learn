public class Basic {
    public static void main(String[] args) {
        // Declare and initialize variables
        int num1 = 10;
        int num2 = 20;

        // Perform some calculations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = (double) num1 / num2;  // Ensure one operand is cast to double for accurate division

        boolean isTrue = true;

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        // Use conditional statements
        if (sum > 30) {
            System.out.println("The sum is greater than 30.");
        } else {
            System.out.println("The sum is not greater than 30.");
        }

        // While loop example
        int count = 1;
        System.out.println("Counting from 1 to 5 using a while loop:");
        while (count <= 5) {
            System.out.println(count);
            count++;
        }

        // Comparison and string concatenation example
        boolean test = num1 > num2;

        System.out.println("Four: " + (2 + 2));  // Parentheses ensure addition before concatenation
        System.out.println("But! Twenty-two: " + 2 + 2);  // Concatenates strings (no parentheses for addition)
    }
}
