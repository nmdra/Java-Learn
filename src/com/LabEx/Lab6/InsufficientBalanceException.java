package LabEx.Lab6;

public class InsufficientBalanceException extends Exception {
    public float Amount;

    public InsufficientBalanceException(float Amount) {
        this.Amount = Amount;
    }

    public float getAmount() {
        return Amount;
    }
}
