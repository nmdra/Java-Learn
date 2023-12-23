package LabEx.DesignPatterns.Singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
           Singleton.getInstance();
            System.out.println(Singleton.getInstance().hashCode());
        }
    }
}
