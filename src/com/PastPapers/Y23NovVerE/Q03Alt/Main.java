package PastPapers.Y23NovVerE.Q03Alt;

public class Main {
    public static void main(String[] args) {
        int  TResources=3;
        int  TUsers=5;
        ResourceManager rm = new ResourceManager(TResources) ;
        for   (int i = 1;i <= TUsers;i++){
            Thread user = new Thread(new User(i,rm));
            user.start();
        }
    }
}
