package LabEx.LabTest.VersionAExt;

import java.util.Arrays;
import java.util.Scanner;

public class LottoTest {
    public static void main(String[] args) {
        Lotto lot = new Lotto();

        Scanner getnum = new Scanner(System.in);

        int[] userNumbers = new int[5];

        System.out.print("Enter the elements of the array: ");

        for (int i = 0; i < userNumbers.length; i++) userNumbers[i] = getnum.nextInt();

        System.out.println("User Numbers: " + Arrays.toString(userNumbers));

        lot.lotnum(); // Lottery Numbers

        System.out.println("Lottery Numbers: " + lot.getLotteryNumbers());

        System.out.println("Number of Matching Digits(Recursion): " + lot.compare(userNumbers, 0));

        System.out.println("Number of Matching Digits: " + lot.matchingDigits(userNumbers).size());

        System.out.print("Matching Digits: " + lot.matchingDigits(userNumbers) );

    }
}
