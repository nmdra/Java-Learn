package LabEx.Lab6;

public class Account {
    private int accID;
    private float balance;

    public Account(int accID) {
        this.accID = accID;
        balance = 0;
    }

    public float getBalance() {
        return balance;
    }

    public void deposit(float deposit) {
        this.balance += deposit;
    }

    public void withdraw(float amount) throws InsufficientBalanceException {
            if(balance > amount){
                balance -= amount;
            } else {
                throw new InsufficientBalanceException(balance);
            }
    }
}
