package OOP.Generics.Examples;

public class GenericClass<T, V> {
    /**
     * <h3>The type parameter naming conventions are as follows:</h3>
     * <li>
     * T - Type
     * <li>
     * E - Element
     * <li>
     * K - Key
     * <li>
     * N - Number
     * <li>
     * V - Value
     */

    private T obj;
    private  V value;

    public GenericClass(T obj) {
        this.obj = obj;
        System.out.println("Object Created.");
    }

    public GenericClass(T obj, V value) {
        this.value = value;
        this.obj = obj;
    }

//    public MyGeneric(T obj, String Name) {
//        this.obj = obj;
//        System.out.println(Name + " Object Created");
//    }

    public void getObj (){
        System.out.println(obj);
        System.out.println(value);
    }

    public void showType(){
        System.out.println("Type of T is " + obj.getClass().getName());
        System.out.println("Type of v is " + value.getClass().getName());
    }
}
