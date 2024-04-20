package OnlineTest.OnlineTest01.Test04;

public class MotorCycle extends Vehicle {
    private int engineCapacity;

    public MotorCycle(String model, double rentalPricePerDay, int engineCapacity) {
        super(model, rentalPricePerDay);
        this.engineCapacity = engineCapacity;
    }

}

