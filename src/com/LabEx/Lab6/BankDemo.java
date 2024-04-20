package LabEx.Lab6;

public class BankDemo {
    public static void main(String[] args) {
       Account account = new Account(123);
        System.out.println("Depositing Rs. 10,000");
        account.deposit(10000);

        try {
            System.out.println("\nWidthrawing Rs.6000");
            account.withdraw(6000);

            System.out.println("\nWithdrawing Rs. 8000");
            account.withdraw(8000);
        } catch (InsufficientBalanceException e){
            System.out.println("Sorry, Your account remains only Rs." + e.getAmount());
            e.printStackTrace();
        }
    }
}
