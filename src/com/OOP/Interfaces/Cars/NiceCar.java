package OOP.Interface.Cars;

public class NiceCar {
    private Engine engine;
    private Media player;
    private Brake brake;

    public NiceCar() {
        engine = new PowerEngine();
        player = new CDPlayer();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }

    public void upgradeEngine() {
        this.engine = new ElecticEngine();
        System.out.println("Engine Upgraded");
    }
}
