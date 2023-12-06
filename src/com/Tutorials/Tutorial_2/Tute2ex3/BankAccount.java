package Tutorials.Tutorial_2.Tute2ex3;

public class BankAccount {
    private int accNo;
    private String accHolderName;
    private float balance;

    BankAccount(){
        accNo = 0;
        accHolderName = "";
        balance = 0;
    }

    BankAccount(int accNo, String accHolderName){
        this.accNo = accNo;
        this.accHolderName = accHolderName;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public void withdrawBalance(float withdraw){
        balance -= withdraw;
    }

    public void depositBalance(float depositAmount){
        balance += depositAmount;
    }

    public void displayDetails(){
        System.out.println("Account No: " + accNo);
        System.out.println("Account Holder's Name: " + accHolderName);
        System.out.println("Current Balance: " + balance);
    }
}

/*
   Access modifier permissions in Java:

   Modifier     Class       Package      Subclass     Global
   public       Y           Y            Y            Y
   protected    Y           Y            Y            N
   default      Y           Y            N            N
   private      Y           N            N            N
*/

