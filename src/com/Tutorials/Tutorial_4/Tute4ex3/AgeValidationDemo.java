package Tutorials.Tutorial_4.Tute4ex3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeValidationDemo {

    public void validateAge(int age) throws AgeValidationException {
            if(age <= 0 || age >= 100 ){
                throw new AgeValidationException("Age Not in Valid Range", new IllegalArgumentException("Invalid Age"));
            }
            else {
                System.out.println("Valid Age: " + age);
            }
    }

    public static void main(String[] args) {
        AgeValidationDemo age = new AgeValidationDemo();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Age: ");
            age.validateAge(scanner.nextInt());
        }
        catch (AgeValidationException e){
            System.out.println(e.getMessage() + "\n" + e.getCause());
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Input Mismatch.\n" + e);
        }
    }

}
