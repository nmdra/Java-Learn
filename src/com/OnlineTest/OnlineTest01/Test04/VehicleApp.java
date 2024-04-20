package OnlineTest.OnlineTest01.Test04;

public class VehicleApp{
    public static void main(String[] args) {
        Car car = new Car("Tesla", 5000.00, 4);
        MotorCycle motorCycle = new MotorCycle("Hornet", 2000.00, 1000);

        System.out.println("Total Cost (Car): " + car.calculateRentalCost(2));
        System.out.println("Total Cost (Motor Cycle): " + motorCycle.calculateRentalCost(5));
    }
}
