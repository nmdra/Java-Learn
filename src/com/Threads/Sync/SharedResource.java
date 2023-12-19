package Threads.Sync;

public class SharedResource {
    public synchronized void display() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(200);
                System.out.println(Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
