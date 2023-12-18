package Threads.SyncBlock;

public class ThreadImpl extends Thread {
    SharedResource sample;

    public ThreadImpl(SharedResource sample) {
        this.sample = sample;
    }

    @Override
    public void run() {
        sample.display();
        sample.display2(sample);
    }
}
