package PastPapers.Y22JuneVerA.Q04;

public class Demo {
    public static void main(String[] args) {
        CarAirBag fAirBag = new FrontAirBag();
        CarAirBag sAirBag = new SideAirBag();

        new NissanCar(fAirBag).assembleLight();
        new NissanCar(fAirBag).assembleMotionSensor();
        new NissanCar(sAirBag).assembleMotionSensor();

        new ToyotaCar(fAirBag).assembleLight();
        new ToyotaCar(fAirBag).assembleMotionSensor();

        new ToyotaCar(sAirBag).assembleLight();
        new ToyotaCar(sAirBag).assembleMotionSensor();

    }
}
