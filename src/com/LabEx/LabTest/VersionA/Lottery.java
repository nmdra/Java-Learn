package LabEx.LabTest.VersionA;

import java.util.Arrays;
import java.util.Random;

public class Lottery {
    private int[] lotteryNumbers = new int[5];
    private int matchCount  = 0;

    public Lottery() {
        Random rd = new Random();

        for (int i = 0; i < 5; i++) {
            lotteryNumbers[i] = rd.nextInt(4);
        }
    }

    public  void matchingDigits(int[] userNumbers) {
        for (int i = 0; i < 5; i++) {
            if (lotteryNumbers[i] == userNumbers[i]) {
                matchCount++;
                System.out.print(" " + i  + ",");
            }
        }
    }

    public int getMatchCount(){
        return matchCount;
    }

    public String getLotteryNumbers() {
        return Arrays.toString(lotteryNumbers);
    }
}
