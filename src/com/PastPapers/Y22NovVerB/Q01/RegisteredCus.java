package PastPapers.Y22NovVerB.Q01;

import java.util.Scanner;

public class RegisteredCus extends Customer {
    private double rewardPoints;
    private  double netAmount;

    public RegisteredCus(int id, String name) {
        super(id, name);
        this.rewardPoints = 0;
        this.netAmount = 0;
    }

    @Override
    public void calculateBill() {

        double billAmount;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bill Amount : ");
        billAmount = sc.nextDouble();

        if (billAmount > 950.0) {
            rewardPoints = 950.0 * (15.0 /100);
        }

        netAmount = billAmount - (billAmount * (7 / 100.0));
    }

    @Override
    public void display() {
        super.display();
        calculateBill();
        System.out.println("Reward Points: " + rewardPoints);
        System.out.println("Net Amount: " + netAmount);
    }
}
