package OOP.Generics.Examples;

public class BoundTypeTest {

    /**
     *To declare a bounded type parameter, list the type parameter's name, followed by the extends keyword,
     * followed by its upper bound in the following format.
     * <li>
     * T extends superclass
     * <li>
     * e.g.: T extends Number
     * <p><p>
     * <i><b>Note: T, can only be replaced by the superclass or its subclasses.</b></i>
     */

    public static void main(String[] args) {

    BoundType<Integer> obj1 = new BoundType<>(3);

    BoundType<Double> obj2 = new BoundType<>(3.0);

//    BoundType<String> obj3 = new BoundType<>("IteratorExample") <-- Not Allowed

    }
}
