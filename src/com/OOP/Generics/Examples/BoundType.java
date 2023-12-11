package OOP.Generics.Examples;

public class BoundType <T extends Number>{
    T number;

    public BoundType(T number) {
        this.number = number;
        System.out.println("Object created. Object Type is " +
                number.getClass().getName());
    }
}
