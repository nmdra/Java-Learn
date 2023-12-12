package Extra;

import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println("Original Array: " + Arrays.toString(arr));

        arr = insert(arr, 8, 3);
        System.out.println("Insert: " + Arrays.toString(arr));

        // Get index
        arr = update(arr, 10, 4);
        System.out.println("Update: " + Arrays.toString(arr));

        getIndex(arr, 8);
    }

    public static void getIndex(int[] array, int value){
        for (int i = 0; array.length > i; i++) {
            if(array[i] == value){
                System.out.println("Index = " + i);
                break;
            }
        }
    }

    public static int[] update(int[] array, int insertVal, int index){
        int[] tempArr = new int[array.length];

        for (int i = 0;  array.length > i; i++) {
            if(i == index){
                tempArr[i] = insertVal;
                continue;
            }
            tempArr[i] = array[i];
        }

        return tempArr;
    }

    public static int[] insert(int[] array, int insertVal, int index) {
        if (index < 0 || index > array.length) {
            return array;
        }

        int[] tempArr = new int[array.length + 1];

        for (int i = 0; i < tempArr.length; i++) {
            if (i == index) {
                tempArr[i] = insertVal;
            } else if (i < index) {
                tempArr[i] = array[i];
            } else {
                tempArr[i] = array[i - 1];
            }
        }

        return tempArr;
    }

}
