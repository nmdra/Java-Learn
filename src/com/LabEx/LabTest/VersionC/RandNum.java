package LabEx.LabTest.VersionC;

import java.util.Arrays;
import java.util.Random;

public class RandNum {

    private int[][] numArr = new int[5][6];

    RandNum(){
        Random rd = new Random();

        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[0].length; j++) {
                numArr[i][j] = rd.nextInt(100);
            }
        }
    }

    public int minimum() {
        int min = numArr[0][0];

        for (int[] ints : numArr) {
            for (int j = 0; j < numArr[0].length; j++) {
                if (ints[j] < min) {
                    min = ints[j];
                }
            }
        }

        return min;
    }


    public int maximum() {
        int max = numArr[0][0];

        for (int[] ints : numArr) {
            for (int j = 0; j < numArr[0].length; j++) {
                if (ints[j] > max) {
                    max = ints[j];
                }
            }
        }

        return max;
    }

    public float avg() {
        int avg = 0;

        for (int[] ints : numArr) {
            for (int j = 0; j < numArr[0].length; j++) {
                    avg = avg + ints[j];
            }
        }

        return (float) avg / (numArr.length * numArr[0].length);
    }

    public void displayMatrix(){

        System.out.println("Matrix:");

        for (int[] num : numArr) {
            System.out.println(Arrays.toString(num));
        }

        System.out.println();
    }
}
