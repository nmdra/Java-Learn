package LabEx.Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        if(arrayList.isEmpty()){
            System.out.println("Enter 10 Numbers: ");
            for (int i = 0; i < 10 ; i++) {
                arrayList.add(scanner.nextInt());
            }
        }

        System.out.println(arrayList);

        System.out.println("Total: " + calTotal(arrayList));

    }

    public static int calTotal(ArrayList<Integer> arr){
        int total = 0;

        for (Integer x: arr){
            total += x;
        }

        return total;
    }
}
