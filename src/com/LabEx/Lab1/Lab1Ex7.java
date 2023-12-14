package LabEx.Lab1;

class Lab1Ex7 {
    public static void main(String[] args) {
        
        int num1 = 4, num2 = 6;

        System.out.println("Sum = " + sum(num1, num2));
        
        System.out.println("Average = " + average(num1, num2));

    }

    private static int sum(int num1, int num2) {
        return num1 + num2;
    }

    private static int average(int num1, int num2) {
        return sum(num1, num2) / 2;
    }
}
