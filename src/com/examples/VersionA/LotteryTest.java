package examples.VersionA;

import java.util.Arrays;
import java.util.Scanner;
public class LotteryTest {
    public static void main(String[] args) {
        Lottery lot = new Lottery();

        Scanner getnum = new Scanner(System.in);

        int[] userNumbers = new int[5];

        System.out.print("Enter the elements of the array: ");

        for (int i = 0; i < userNumbers.length; i++) {
            userNumbers[i] = getnum.nextInt();
        }

        System.out.println("User Numbers: " + Arrays.toString(userNumbers));

        System.out.println("Lottery Numbers: " + lot.getLotteryNumbers());
        System.out.print("Matching Digits: ");
        lot.matchingDigits(userNumbers);
        System.out.println();
        System.out.println("Number of Matching Digits: " + lot.getMatchCount());
}
}
