package Tutorials.Tutorial_3.Tute3ex2;

public class testFeet {
    public static void main(String[] args) {
        Feet mylength = new Feet(5,6);
        mylength.print("Length : "); // should print Length : 5’6”

        Feet len = new Feet(mylength);
        len.print("Length: ");

        Feet newlen = new Feet(6,7);

        mylength.add(newlen);
        mylength.print(); // 12’1”

        Feet.print(mylength);

        Feet f5 = Feet.add(mylength, len, newlen);
        f5.print();
    }
}
