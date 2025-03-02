package DesignPatterns.DependencyInjection;

public class DependencyInjectionDemo {
    public static void main(String[] args) {

        // Inject PetrolEngine dependency
        Engine petrolEngine = new PetrolEngine();
        Car car1 = new Car(petrolEngine);
        car1.drive();

        Engine dieselEngine = new DieselEngine();
        Car car2 = new Car(dieselEngine);
        car2.drive();
    }
}
