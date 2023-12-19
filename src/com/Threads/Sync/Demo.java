package Threads.Sync;

public class Demo {
    public static void main(String[] args) {
        SharedResource sample = new SharedResource();
        SharedResource sample1 = new SharedResource();

        Thread threadImpl1 = new ThreadImpl(sample);
        Thread threadImpl2 = new ThreadImpl(sample);

        threadImpl1.start();
        threadImpl2.start();
    }
}
