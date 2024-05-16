package PastPapers.Y23JuneVerB.Q04;

public class RocketMissileSystem implements MissileSystem {
    private static volatile RocketMissileSystem instance;

    private RocketMissileSystem(){
        System.out.println("Initialized RocketMissileSystem");
    }

    public static RocketMissileSystem getInstance(){
        if(instance == null){
            synchronized (RocketMissileSystem.class){
                if(instance == null){
                    instance = new RocketMissileSystem();
                }
            }
        }
        return instance;
    }

    @Override
    public void launch(String source) {
        System.out.print("Rocket Missile Launched from " + source);
    }

    @Override
    public void blast(String destination) {
        System.out.println(" and Rocket Missile blast from " + destination);
    }
}
