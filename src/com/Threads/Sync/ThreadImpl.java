package Threads.Sync;

public class ThreadImpl extends Thread {
    SharedResource sample;

    public ThreadImpl(SharedResource sample) {
        this.sample = sample;
    }

    public void run() {
        sample.display();
    }
}
