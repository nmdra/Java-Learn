package OnlineTest.OnlineTest01.Test03;

public class MathOperations {

    public void drawMultiplicationTable(int number, int range){
        for (int i = 1; i <= range ; i++) {
            System.out.println(i + " x " + number + " = " + (i * number));
        }

        System.out.println();
    }

    public int factorial(int value){
        int fact = 1;

        for (int i = value; i > 0; i--) {
            fact *= i;
        }

        return fact;
    }
}

