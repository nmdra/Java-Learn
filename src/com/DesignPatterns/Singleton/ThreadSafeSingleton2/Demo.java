package DesignPatterns.Singleton.ThreadSafeSingleton2;

public class Demo implements Runnable{
    public static void main(String[] args) {
        Thread thread = new Thread(new Demo());
        thread.start();

        for (int i = 0; i < 10; i++) {
            Singleton.getInstance();
            System.out.println(Singleton.getInstance());
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Singleton.getInstance();
        }
    }
}
