package basic.ExceptionHandling;

import java.io.IOException;

public class CheckedExample {

    // This method has a checked exception, so it must be declared using 'throws'
    private static void handleIOException() throws IOException {
        throw new IOException("This is a checked exception.");
    }

    public static void main(String[] args) {
        try {
            handleIOException();
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}
