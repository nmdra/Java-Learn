package PastPapers.Y23NovVerE.Q03Alt;

public class User implements Runnable{

    private int userId;
    private ResourceManager rmanager;

    public User(int userId, ResourceManager rmanager) {
        super();
        this.userId = userId;
        this.rmanager = rmanager;
    }

    public void run() {
        rmanager.requestResource(userId);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rmanager.releaseResource(userId);
    }
}