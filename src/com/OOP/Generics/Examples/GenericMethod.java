package OOP.Generics.Examples;

public class GenericMethod {
    public static void main(String[] args) {

        Integer[] intArr = {1,2,3,4,5,6};
        String[] strArr = {"Nimendra", "Dilshan"};

        print(intArr);
        print(strArr);
    }

    public static <E> void print(E[] elements){
        for (E element : elements){
            System.out.print(element + " ");
        }

        System.out.println();
    }
}
