package PastPapers.Y22JuneVerA.Q03;

import java.util.ArrayList;

public class ProducerThread implements Runnable {

    int element;
    final ArrayList<Integer> queue;

    public ProducerThread(ArrayList<Integer> queue) {
        this.element = 10;
        this.queue = queue;
    }

    public void add(){
        queue.add(element);
        System.out.println("Producer adding value = " + element + " to queue");
        element+=10;
    }

    @Override
    public void run() {
        while(true){
            synchronized (queue) {
                System.out.println("Producer started");
                try {
                    if(!queue.isEmpty()){
                        queue.wait();
                    }
                    add();
                    Thread.sleep(1000);
                    queue.notify();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
