package OnlineTest.OnlineTest2.GenericMethodProcessor;

public class GenericMethod {

    public GenericMethod() {
    }

    public <T extends Number> double findMax(T[] arr){
        double max = arr[0].doubleValue(); // Initialize max with the double value of the first element
        for(T num : arr){
            if(num.doubleValue() > max){ // Compare double value of num with max
                max = num.doubleValue(); // Update max if num is greater
            }
        }
        return max; // Return the maximum value found
    }

    public <T extends Number> double findMin(T[] arr){
        double min = arr[0].doubleValue(); // Initialize max with the double value of the first element
        for(T num : arr){
            if(num.doubleValue() < min){ // Compare double value of num with max
                min = num.doubleValue(); // Update max if num is greater
            }
        }
        return min; // Return the maximum value found
    }
}