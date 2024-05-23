package PastPapers.Y22JuneVerA.Q03;

import java.util.ArrayList;

public class ConsumerThread implements Runnable {

    int element;

    final ArrayList<Integer> queue;

    public ConsumerThread(ArrayList<Integer> queue) {
        this.element = 0;
        this.queue = queue;
    }

    void removeElement() {
        System.out.println("Consumer thread consumes " + queue.removeFirst());
        System.out.println("Elements in Queue = " + queue);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                System.out.println("Consumer Started");
                try {
                    if (queue.isEmpty()) {
                        queue.wait();

                    }
                    removeElement();
                    queue.notify();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
