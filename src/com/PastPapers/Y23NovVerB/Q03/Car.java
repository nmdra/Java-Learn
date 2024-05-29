package PastPapers.Y23NovVerB.Q03;

public class Car implements Runnable {
    private final Object lock;

    public Car(Object lock) {
        this.lock = lock;
    }

    @Override
    public  void run() {
        synchronized (lock) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Car is racing");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
