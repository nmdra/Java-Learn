package OnlineTest.OnlineTest2.GenericMethodProcessor;

public class GenericTest {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4,5};
        Double[] arr2 = {1.2,2.0,3.8,4.0};

        GenericMethod gn = new GenericMethod();

        System.out.println("Max" + gn.findMax(arr1));
        System.out.println("Min" + gn.findMin(arr1));
        System.out.println();
        System.out.println("Max" + gn.findMax(arr2));
        System.out.println("Max" + gn.findMin(arr2));
    }
}
