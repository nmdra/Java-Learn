package Tutorial.Tutorial_2.Tute2ex3;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        BankAccount[] acc = new BankAccount[2];

        acc[0] = new BankAccount(111, "George");
        acc[1] = new BankAccount(222, "Miller");

        acc[0].setBalance(100000);
        acc[1].setBalance(302930);

        Scanner get = new Scanner(System.in);

        System.out.println("Enter Withdraw Amount: ");
        float withdraw = get.nextFloat();

        acc[0].withdrawBalance(withdraw);

        System.out.println("Enter Deposit Amount: ");
        float deposit = get.nextFloat();

        acc[1].depositBalance(deposit);

        acc[0].displayDetails();
        System.out.println();
        acc[1].displayDetails();
    }
}
