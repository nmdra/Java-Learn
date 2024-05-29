package PastPapers.Y23NovVerB.Q03;

public class Bike implements Runnable{
    private final Object lock;

    public Bike(Object lock) {
        this.lock = lock;
    }

    public void run(){
        synchronized (lock) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Bike is racing");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
