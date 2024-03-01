// Create a Java program that reads a positive integer (n) from the user and calculates the factorial of that number(n!) using a loop.

package Tutorials.Tutorial_1;

import java.util.Scanner;

class Tute1ex1 {
    static int factorial(int number) {
        if(number < 0) {
            return -1;
        }

        if(number == 0) {
            return 1;
        } else {
            return(number * factorial(number - 1));
        }

        // 5! --> 5 * 4! --> 
    }

    public static void main(String[] args) {
        int num;
        // creating the instance of class Scanner
        Scanner getNum = new Scanner(System.in); 

        System.out.print("Enter Number: ");
        num = getNum.nextInt();

        int fact = factorial(num);

        System.out.println("Factorial of " + num + " = " + fact );

        getNum.close();
    }
}
