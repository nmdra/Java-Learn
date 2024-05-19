package PastPapers.Y23JuneVerB.Q03;

public class EvenOddPrinter {
    private static final int MAX_NUM = 20;
    private static volatile int nextNum = 1;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenRunnable(), "EvenThread");

        Thread oddThread = new Thread(new OddRunnable(), "OddThread");

        evenThread.start();
        oddThread.start();

        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class EvenRunnable implements Runnable{

        private void displayEven() {
            synchronized (lock) {
                while (nextNum <= MAX_NUM) {
                    if (nextNum % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + "\t" + nextNum);
                        nextNum++;
                        lock.notify();
                    }

                    try{
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notifyAll();
            }
        }


        @Override
        public void run() {
            displayEven();
        }
    }

    static class OddRunnable implements Runnable{

        private void displayEven() {
            synchronized (lock) {
                while (nextNum <= MAX_NUM) {
                    if (nextNum % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + "\t" + nextNum);
                        nextNum++;
                        lock.notify();
                    }

                    try{
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notifyAll();
            }
        }


        @Override
        public void run() {
            displayEven();
        }
    }

}

