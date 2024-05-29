package PastPapers.Y23NovVerB.Q02BAlt;

public class Genericcalculator <T extends Number>{

	public T CalculateMaximum(T[] arry) {
		
		T max = arry[0];
		
		for(T arr : arry) {
			if(max.doubleValue() < arr.doubleValue()) {
				max = arr;
			}
		}
		return max;
	}
	
	public double calculateProduct(T[] arry) {
		
		double product = 1.0;
		
		for(T arr : arry) {
			product = product*arr.doubleValue();
		}
		return product;
	}
}
