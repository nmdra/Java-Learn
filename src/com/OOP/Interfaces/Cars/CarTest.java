package OOP.Interfaces.Cars;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Tesla");

        System.out.println(car.name);
        car.acc();
        car.start();
        car.stop();

        System.out.println();

        Media carMedia = new Car();
        carMedia.stop();

        System.out.println();

        // Engine carEngine = new Engine() {} <-- Does Not work

        Engine carEngine = new Car();

        carEngine.start();
    }

}
