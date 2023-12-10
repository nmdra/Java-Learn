package OOP.Interface.Cars;

public class NiceCarTest {
    public static void main(String[] args) {

        NiceCar car = new NiceCar();
        ElecticEngine electricEngine = new ElecticEngine();
        Engine powerEngine = new PowerEngine();

        NiceCar myElectricCar = new NiceCar(electricEngine);

        car.start();
        car.startMusic();
        car.upgradeEngine();

        System.out.println();

        myElectricCar.start();
        myElectricCar.startMusic();
        myElectricCar.stop();
    }
}
