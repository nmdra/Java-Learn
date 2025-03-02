package DesignPatterns.DependencyInjection;

//Dependent Class
public class Car {
    private final Engine engine;

    // Dependency Receives here
    public Car (Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}
