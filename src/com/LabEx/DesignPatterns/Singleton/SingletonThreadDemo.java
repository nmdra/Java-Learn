package LabEx.DesignPatterns.Singleton;

public class SingletonThreadDemo {
    public static void main(String[] args) {

        int numberOfThreads = 10;

        for (int i = 1; i <= numberOfThreads; i++) {
            Thread th = new Thread(new ThreadImpl());
            th.start();
        }

    }
}