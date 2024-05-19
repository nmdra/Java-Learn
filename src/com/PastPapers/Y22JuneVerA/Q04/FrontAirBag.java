package PastPapers.Y22JuneVerA.Q04;

public class FrontAirBag implements CarAirBag {
    @Override
    public void airBagMotionDetection() {
        System.out.println("Motion detection on for front Air Bag");
    }

    @Override
    public void airBagLightIndicator() {
        System.out.println("Light indicator on for front Air Bag");
    }
}
