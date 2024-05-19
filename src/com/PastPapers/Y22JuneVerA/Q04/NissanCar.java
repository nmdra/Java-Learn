package PastPapers.Y22JuneVerA.Q04;

public class NissanCar implements Car {

    CarAirBag carAirBag;

    public NissanCar(CarAirBag carAirBag){
        this.carAirBag=carAirBag;
    }

    @Override
    public void assembleLight() {
        System.out.println("Assembling for Nissan");
        carAirBag.airBagLightIndicator();
    }

    @Override
    public void assembleMotionSensor() {
        System.out.println("Assembling for Nissan");
        carAirBag.airBagMotionDetection();
    }
}
