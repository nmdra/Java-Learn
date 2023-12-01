package Tutorial;

import java.util.Scanner;

class Tute1ex3 {
    static void calculate(int n, int n2) {
        for(int i = 1; i <= n2; i++) {
            System.out.println(n + "x" + i + "=" + n * i); 
        }
    }

    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = getNum.nextInt();

        System.out.print("Enter End Number: ");
        int num2 = getNum.nextInt();

        System.out.println("------------------");

        calculate(num, num2);

        getNum.close();
    }
}
