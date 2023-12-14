package LabEx.Lab2.Lab2Ex5;

import java.util.Scanner;

public class NumCheck {
    public static void main(String[] args) {
        EvenOddNumber evenOdd = new EvenOddNumber();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = input.nextInt();

        if (evenOdd.findEvenOrOdd(num)) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}