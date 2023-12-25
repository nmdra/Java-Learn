package DesignPatterns.Singleton.Basic;

public class SingletonDemo {
    public static void main(String[] args) {
        System.out.println("""
                If you see the same value, then singleton was reused (yay!)
                If you see different values, then 2 singletons were created (boo!!)

                RESULT:
                """);

        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");

        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
        System.out.println(singleton.hashCode());
        System.out.println(anotherSingleton.hashCode());
    }
}