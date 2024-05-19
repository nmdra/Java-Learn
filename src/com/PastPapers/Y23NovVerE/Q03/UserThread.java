package PastPapers.Y23NovVerE.Q03;

public class UserThread extends Thread {

    private int userId;
    private ResourceManager resourceManager;

    public UserThread(int userId, ResourceManager resourceManager) {
        this.userId = userId;
        this.resourceManager = resourceManager;
    }

    public void resource() throws InterruptedException {
        int res; // store acquired resource
        synchronized (resourceManager) {
            res = resourceManager.requestResource();
            if (res == -1) {
                System.out.println("User " + userId + " is waiting for a resource.");
                resourceManager.wait();
                res = resourceManager.requestResource();  //get the resource again after waiting is over
            }
        }

        System.out.println("User " + userId + " acquires Resource " + res);
        Thread.sleep(500); // Simulate resource usage

        synchronized (resourceManager) {
            resourceManager.releaseResource(res);
            System.out.println("User " + userId + " releases Resource " + res);
        }
    }

    @Override
    public void run() {
        try {
            resource();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}