package PastPapers.Y23NovVerE.Q03;

public class ResourceTest {
    public static void main(String[] args) {
        int TResources = 3;
        int TUsers = 5;

        ResourceManager rm = new ResourceManager(TResources);

        for (int i = 1; i <= TUsers; i++) {
            UserThread userThread = new UserThread(i, rm);
            userThread.start();
        }
    }
}
