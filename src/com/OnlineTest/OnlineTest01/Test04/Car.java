package OnlineTest.OnlineTest01.Test04;

public class Car extends Vehicle {
    private int numSeats;

    public Car(String model, double rentalPricePerDay, int numSeats) {
        super(model, rentalPricePerDay);
        this.numSeats = numSeats;
    }

}
