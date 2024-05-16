package PastPapers.Y23JuneVerB.Q04;

public class TestMissileSystem {
    public static void main(String[] args) {
        MissileSystem heatMissile = HeatMissileSystem.getInstance();
        MissileSystem rocketMissile = RocketMissileSystem.getInstance();

        MissileController missileController = MissileController.getInstance();

        missileController.setLaunch(heatMissile);
        missileController.setBlast(heatMissile);
        missileController.performLaunching("Galle Face");
        missileController.performBlasting("Flight MH370");

        System.out.println();

        missileController.setLaunch(rocketMissile);
        missileController.setBlast(rocketMissile);
        missileController.performLaunching("Colombo");
        missileController.performBlasting("Kurunegala");
    }
}
