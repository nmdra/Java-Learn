package LabEx.DesignPatterns.Singleton;

public class Singleton {
    private static Singleton singleton;

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
            System.out.println("Singleton invocation");
        }
        return singleton;
    }
}

