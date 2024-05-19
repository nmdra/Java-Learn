package PastPapers.Y22JuneVerA.Q04;

public class SideAirBag implements CarAirBag {
    @Override
    public void airBagMotionDetection() {
        System.out.println("Motion Detection for Side air Bag");
    }

    @Override
    public void airBagLightIndicator() {
        System.out.println("Light Indicator for Side air Bag");
    }
}
