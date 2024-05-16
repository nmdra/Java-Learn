package PastPapers.Y23JuneVerB.Q04;

public class HeatMissileSystem implements MissileSystem {
    private static volatile HeatMissileSystem instance;

    private HeatMissileSystem(){
        System.out.println("Initialize HeatMissileSystem...");
    }

    public static HeatMissileSystem getInstance() {
        if (instance == null) {
            synchronized (HeatMissileSystem.class) {
                if (instance == null) {
                    instance = new HeatMissileSystem();
                }
            }
        }
        return instance;
    }

    @Override
    public void launch(String source) {
        System.out.print("Heat Missile Launched from " + source);
    }

    @Override
    public void blast(String destination) {
        System.out.print(" and Heat Missile blast " + destination);

    }
}
