package OOP.Generics.Examples;

/**
 * This class demonstrates a generic method in Java.
 */
public class GenericMethodExample {

    /**
     * This method takes an array of any type and swaps the elements at the given positions.
     * @param array the array of elements
     * @param index1 the index of the first element to swap
     * @param index2 the index of the second element to swap
     * @param T the type of elements in the array (can be any type)
     */
    public static <T> void swap(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        // Example usage:
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Before swapping:");
        for (Integer num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Swap elements at index 1 and index 3
        swap(intArray, 1, 3);

        System.out.println("After swapping:");
        for (Integer num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
