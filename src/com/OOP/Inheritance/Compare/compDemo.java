package OOP.Inheritance.Compare;

public class compDemo {
    public static void main(String[] args) {
        Point p1 = new Point(10,5);
        Point p2 = new Point(10,5);

        boolean isEqual = p1 == p2;

        System.out.println(isEqual);
//        System.out.println(p2.equals(new ThreePoint(1,2,3)));
        System.out.println(p2.equals(p1));
    }

}
