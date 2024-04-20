package OnlineTest.OnlineTest01.Test03;

public class MathApp{
    public static void main(String[] args) {
       MathOperations MO = new MathOperations();

       MO.drawMultiplicationTable(7, 10);

       System.out.println("Factorial : " + MO.factorial(5));
    }
}
