package DesignPatterns.Factory.FactoryMethod;

public class MotorcycleFactory extends MotorVehicleFactory {
    @Override
    protected MotorVehicle createMotorVehicle() {
        System.out.println("Create MotorCycle");
        return new Motorcycle();
    }
}