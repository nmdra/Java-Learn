package PastPapers.Y22JuneVerA.Q04;

public class ToyotaCar implements Car {

    CarAirBag carAirBag;

    public ToyotaCar(CarAirBag carAirBag){
        this.carAirBag=carAirBag;
    }

    @Override
    public void assembleLight() {
        System.out.println("Assembling for Toyota");
        carAirBag.airBagLightIndicator();
    }

    @Override
    public void assembleMotionSensor() {
        System.out.println("Assemble for Toyota");
        carAirBag.airBagMotionDetection();
    }
}
