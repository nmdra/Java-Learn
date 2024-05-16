package PastPapers.Y23JuneVerB.Q04;

public class LaunchMissile implements MissileOperation {

    MissileSystem missileSystem;

    public LaunchMissile(MissileSystem missileSystem){
        this.missileSystem = missileSystem;
    }

    @Override
    public void initiateOperation(String location) {
        missileSystem.launch(location);
    }
}
