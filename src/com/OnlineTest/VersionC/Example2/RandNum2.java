package Test.VersionC.Example2;

import java.util.Arrays;
import java.util.Random;

public class RandNum2 {
    int[][] arr = new int[5][5];

    public RandNum2() {
        Random rd = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = rd.nextInt(1, 100);
            }
        }
    }

    private int findMin() {
        int min = arr[0][0];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

    private int findMax() {
        int max = arr[0][0];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    private float calculateAvg() {
        int tot = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tot += arr[i][j];
            }
        }
        return (float) tot/25;
    }

    private void display() {
        System.out.println(Arrays.deepToString(arr));
        System.out.printf("Min = %d\nMax = %d\nAverage = %s%n", findMin(), findMax(), calculateAvg());
    }

    public static void main(String[] args) {
        RandNum2 rd = new RandNum2();
        rd.display();
    }
}
