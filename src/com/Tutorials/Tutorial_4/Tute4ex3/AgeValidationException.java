package Tutorials.Tutorial_4.Tute4ex3;

public class AgeValidationException extends Exception{
    public AgeValidationException(String message) {
        super(message);
    }

    public AgeValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}
