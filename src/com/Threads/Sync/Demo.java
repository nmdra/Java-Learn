package Threads.Sync;

public class Demo {
    public static void main(String[] args) {
        SharedResource sample = new SharedResource();
        SharedResource sample1 = new SharedResource();

        ThreadImpl threadImpl1 = new ThreadImpl(sample);
        ThreadImpl threadImpl2 = new ThreadImpl(sample);

        threadImpl1.start();
        threadImpl2.start();
    }
}
