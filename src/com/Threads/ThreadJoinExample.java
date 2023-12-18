package Threads;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": Count " + i);
            try {
                Thread.sleep(500); // Simulating some work
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class ThreadJoinExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();

        thread1.start();

        thread1.join();

        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": Count " + i);
            try {
                Thread.sleep(500); // Simulating some work
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
