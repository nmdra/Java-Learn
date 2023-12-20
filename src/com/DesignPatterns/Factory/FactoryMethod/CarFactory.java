package DesignPatterns.Factory.FactoryMethod;

public class CarFactory extends MotorVehicleFactory {
    @Override
    protected MotorVehicle createMotorVehicle() {
        System.out.println("Create Car");
        return new Car();
    }
}