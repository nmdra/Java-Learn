package OOP.Wrapper;

public class WrapperClass {
    public static void main(String[] args) {
        // Example with Integer wrapper class
        int primitiveInt = 42;

        // Convert primitive int to Integer object
        Integer wrappedInt = Integer.valueOf(primitiveInt); // Boxing / Wrapping
        Integer autoWrappedInt2 = primitiveInt; // AutoBoxing

        // Convert Integer object to primitive int
        int unwrappedInt = wrappedInt.intValue(); // Unwrapping
        int unwrappedInt2 = autoWrappedInt2 ; // Autounboxing: Integer to int

        // Autoboxing and Autounboxing (Java 5 and later)

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Unwrapped int: " + unwrappedInt);

        System.out.println("---------------");

        // Example with Double wrapper class
        double primitiveDouble = 3.14;

        // Convert primitive double to Double object
        Double wrappedDouble = Double.valueOf(primitiveDouble);

        // Convert Double object to primitive double
        double unwrappedDouble = wrappedDouble.doubleValue();

        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Wrapped Double: " + wrappedDouble);
        System.out.println("Unwrapped double: " + unwrappedDouble);

        System.out.println("---------------");
    }
}

