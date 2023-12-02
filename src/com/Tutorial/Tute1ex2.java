/* Develop a Java program that prompts the user to enter a series of numbers (terminated by a negative number) and then computes and displays the average of those numbers.  Hint: Use Scanner class to accept keyboard inputs */


package Tutorial;

import java.util.Scanner;

class Tute1ex2 {
    public static void main(String[] args) {

        Scanner getNum = new Scanner(System.in);
        int number, count = 0;
        float total = 0;

        while(true) {
            System.out.print("Enter Number: ");
            number = getNum.nextInt();

            if(number < 0) {
                break;
            }

            total = total + number;

            count++;
        } 

        System.out.println("Average: " + total / count);

        getNum.close();

    }
}
