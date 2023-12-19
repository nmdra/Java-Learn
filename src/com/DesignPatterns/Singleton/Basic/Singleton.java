package DesignPatterns.Singleton;

/**
 * Make the default constructor private,
 * to prevent other objects from using the new operator with the Singleton class.
 * Create a static creation method that acts as a constructor.
 * <p>
 * Under the hood, this method calls the private constructor to create an object
 * and saves it in a static field. All following calls to this method return the
 * cached object.
 */

public final class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}

// Source: refactoring.guru