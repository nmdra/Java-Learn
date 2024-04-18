package OnlineTest.VersionA.Example2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lottery2 {
    int[] lotteryNumbers = new int[5];
    int[] userLotteryNumbers = new int[5];
    ArrayList<Integer> matchedNumbers = new ArrayList<>();

    Random rd = new Random();

    public Lottery2() {
        for (int i = 0; i < 5; i++) {
            lotteryNumbers[i] = rd.nextInt(9);
        }
    }

    public void getUserLotteryNumbers(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Lottery Number: ");

        for (int i = 0; i < 5; i++) {
            userLotteryNumbers[i] = sc.nextInt();
        }

    }

    public void Match(){
        for (int i = 0; i < 5; i++) {
            if (lotteryNumbers[i] == userLotteryNumbers[i]) {
                matchedNumbers.add(lotteryNumbers[i]);
            }
        }

        Display();
    }

    public void Display(){
        System.out.println("User's Numbers: " + Arrays.toString(userLotteryNumbers)); // Use For Loop
        System.out.println("Lottery Numbers: " + Arrays.toString(lotteryNumbers)); // Use For Loop
        System.out.println("Number of Matching Digits: " + matchedNumbers.size());
        System.out.println("Matching Digits: " + matchedNumbers.toString()); // User For Loop
    }

}
