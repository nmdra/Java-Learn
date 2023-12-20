package DesignPatterns.Factory.FactoryMethod;

public class MainApp {
    public static void main(String[] args) {
        MotorVehicleFactory mr = new MotorcycleFactory();
        mr.createMotorVehicle();

        System.out.println();

        MotorVehicleFactory car = new CarFactory();
        car.createMotorVehicle();
    }
}
