package LabEx.DesignPatterns.Singleton;

public class ThreadImpl implements Runnable{

    @Override
    public void run() {
        SingletonThread singleton = SingletonThread.getInstance();
        System.out.println(singleton.hashCode());
    }
}
