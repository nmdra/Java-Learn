package LabEx.DesignPatterns.Singleton;

public class SingletonThread {
    private static SingletonThread singleton;

    public SingletonThread() {
        System.out.println("Singleton invocation");
    }

    public synchronized static SingletonThread getInstance() {
        if (singleton != null) {
            return singleton;
        }

        singleton = new SingletonThread();
        return singleton;
    }
}
