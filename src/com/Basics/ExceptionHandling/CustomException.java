package Basics.ExceptionHandling;

class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}

class CustomExceptionTest {
    public static void main(String[] args) {
        int x = 5, y = 1000;

        try {
            float z = (float) x / (float) y;
            if (z < 0.01) {
                throw new CustomException("Number is too small");
            }
        } catch (CustomException e) {
            System.out.println("Caught my exception");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I am always here");
        }
    }
}
