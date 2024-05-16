package PastPapers.Y23JuneVerB.Q04;

public class MissileController {
    private static volatile MissileController instance;

    private MissileOperation missileOperation, missileOperation2;

    private MissileController(){
        System.out.println("Initialize MissileController");
    }

    public static MissileController getInstance(){
        if(instance == null){
            synchronized (MissileController.class){
                if(instance == null){
                    instance = new MissileController();
                }
            }
        }
        return instance;
    }

    public void setLaunch(MissileSystem missileSystem){
       missileOperation = new LaunchMissile(missileSystem);
    }

    public void setBlast(MissileSystem missileSystem){
        missileOperation2 = new BlastMissile(missileSystem);
    }

    public void performLaunching(String start) {
        missileOperation.initiateOperation(start);
    }

    public void performBlasting(String end) {
        missileOperation2.initiateOperation(end);
    }
}
