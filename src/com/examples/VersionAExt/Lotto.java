package examples.VersionAExt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Lotto {
    private int[] lotteryNumbers = new int[5];

    public Lotto() {
        Random rd = new Random();
        for (int i = 0; i < 5; i++) lotteryNumbers[i] = rd.nextInt(4);
    }

    public  ArrayList<Integer> matchingDigits(int[] userNumbers) {
        ArrayList<Integer> matchDigits = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            if (lotteryNumbers[i] == userNumbers[i]) {
                matchDigits.add(lotteryNumbers[i]);
            }
//            matchDigits.add(lotteryNumbers[i] == userNumbers[i] ? lotteryNumbers[i] : null);
        }
        return matchDigits;
    }

    public int compare(int[] userNumbers, int index) {

        if (index >= userNumbers.length) return 0;

        int count = lotteryNumbers[index] == userNumbers[index] ? 1 : 0;

        return count + compare(userNumbers, (index + 1));
    }

    public String getLotteryNumbers() {
        return Arrays.toString(lotteryNumbers);
    }

    public void lotnum() {
        System.out.print("Lottery Numebers: ");

        for (int num : lotteryNumbers) System.out.print(num + " ");

        System.out.println();
    }
}
