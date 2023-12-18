package Threads;

class YieldThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; ++i) {
            // By calling this method,
            // MyThread stop its execution and giving a chance to a main thread.
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + " started.");
        }
        System.out.println(Thread.currentThread().getName() + " ended.");
    }
}

public class YieldMethodTest {
    public static void main(String[] args) {
        YieldThread thread = new YieldThread();
        thread.start();
        for (int i = 0; i < 5; ++i) {
            System.out.println(Thread.currentThread().getName() + " started.");
        }
        System.out.println(Thread.currentThread().getName() + " ended.");
    }
}
