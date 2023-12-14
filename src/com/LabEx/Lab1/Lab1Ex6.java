package LabEx.Lab1;

class Lab1Ex6 {
    public static void main(String[] args) {

        for(int column = 1; column <= 5; column++) {
            for(int raw = 0; raw < 5; raw++) {
                System.out.print("* ");
            }

            System.out.print("\t");

            for(int raw = 0; raw < 5 - column; raw ++) {
                System.out.print(" ");
            }

            for(int raw = 0; raw < column; raw ++) {
                System.out.print("* ");
            }

            System.out.print("\n");
        }
    }
}