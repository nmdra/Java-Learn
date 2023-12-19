package Threads.SyncBlock;

public class SharedResource {
    public void display() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(200);
                System.out.println(Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public void display2(SharedResource sample) {
        synchronized (sample) {
            try {
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(200);
                    System.out.println(Thread.currentThread().getName() + " (Sync Block)");
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(200);
                System.out.println(Thread.currentThread().getName() + " (UnSync Block)");
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
