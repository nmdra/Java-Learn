package OOP.Generics.Examples;

public class GenericClassTest {
    public static void main(String[] args) {
        GenericClass<Integer, String> gentst = new GenericClass<>(2, "nmdra");
        gentst.getObj();
        gentst.showType();

        System.out.println();

        GenericClass<Integer, Object> gentst2 = new GenericClass<>(3, 3.0);
        gentst2.getObj();
        gentst2.showType();

        System.out.println();

        GenericClass<Integer, Object> gentst3 = new GenericClass<>(4);
        gentst3.getObj();
//        gentst3.showType(); <-- NullPointerException
    }
}
