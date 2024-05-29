package PastPapers.Y23NovVerB.Q03;

public class RaceRunner {
    public static void main(String[] args) {
        Object lock = new Object();

        Thread carThread = new Thread(new Car(lock));
        Thread bikeThread = new Thread(new Bike(lock));

        carThread.start();
        bikeThread.start();
    }
}
