package PastPapers.Y23JuneVerB.Q02.Q02A;

import java.util.ArrayList;
import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter numbers (0 to quit): ");
        while(true){
            int input;
            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();

           if(input !=0) {
               arr.add(input);
           } else break;
        }

//        arr.removeIf(i -> i % 2 == 0);

        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
            }
        }

        System.out.println("Odd numbers: " + arr.toString());
    }
}
