package PastPapers.Y23NovVerB.Q02B;

public class GenericCalculator {
    public <N extends Number> N calculateMaximum(N[] arr){
        N max = arr[0];
        for(N n : arr){
            if(max.doubleValue() < n.doubleValue()){
                max = n;
            }
        }
        return max;
    }


    public <N extends Number> double calculateProduct(N[] arr){
        double product = 1.0;
        for(N n : arr){
            product *= n.doubleValue();
        }
        return product;
    }



}
