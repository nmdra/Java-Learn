package PastPapers.Y23JuneVerB.Q04;

public class BlastMissile implements MissileOperation {

    MissileSystem missileSystem;

    public BlastMissile(MissileSystem missileSystem){
        this.missileSystem = missileSystem;
    }

    @Override
    public void initiateOperation(String location) {
        missileSystem.blast(location);
    }
}
