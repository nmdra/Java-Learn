package PastPapers.Y23NovVerE.Q03Alt;

public class ResourceManager {
    private int totalresource;
    private int acquire;

    public ResourceManager(int totalresource) {
        super();
        this.totalresource = totalresource;
        this.acquire = 0;
    }

    public synchronized void requestResource(int userid) {
        if (acquire >= totalresource) {
            try {
                wait();
                System.out.println("User "+ userid+" is  waiting  for  a  resource.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("User "+ userid+" acquires resource "+acquire);
        acquire++;
    }

    public synchronized void releaseResource(int userid) {
        notify();
        System.out.println("User "+ userid+" releases resource "+(acquire-1));
        acquire--;
    }
}
