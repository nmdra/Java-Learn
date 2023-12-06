package Tutorials.Tutorial_2.Tute2ex1Ext;

import java.util.Scanner;

public class testStudent {
    public static void main(String[] args) {

        final int VALUE = 3;

        Student[] std = new Student[VALUE];

        Scanner str = new Scanner(System.in);

        int[] mark = new int[3];

        for(int i = 0; i < VALUE; i++) {
            System.out.print("Enter Student " + (i + 1) + " ID: ");
            String stdId = str.next();

            System.out.print("Enter Student " + (i + 1) + " Name: ");
            String name = str.next();

            std[i] = new Student(stdId, name);

            for(int j = 0; j < 3; j++) {
                System.out.print("Enter Student " + (i + 1) + " Marks "
                        + (j + 1) +  " : ");
                mark[j] = str.nextInt();

            }

            std[i].setMarks(mark[0], mark[1], mark[2]);
        }

        for (int i = 0; i < VALUE; i++) {
            System.out.println();
            std[i].printDetails();
        }
    }
}
