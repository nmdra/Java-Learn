package LabEx.Collections;

import java.util.HashSet;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        HashSet<Double> height = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the heights of 10 students:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Height of student " + (i + 1) + ": ");
            height.add(scanner.nextDouble());
        }

        System.out.println(height);
        System.out.println((height.size()));
    }
}
