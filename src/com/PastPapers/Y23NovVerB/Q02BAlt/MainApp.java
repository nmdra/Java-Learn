package PastPapers.Y23NovVerB.Q02BAlt;

public class MainApp {

	public static void main(String[] args) {
		Integer[] arr1 = {6,8,9,10,7};
		Genericcalculator<Integer> m = new Genericcalculator<Integer>();
	
		System.out.println("Maximum: " + m.CalculateMaximum(arr1));
		System.out.println("Product: " + m.calculateProduct(arr1));
		
		Double[] arr2 = {6.0,8.0,9.0,10.0,7.0}; 
		Genericcalculator<Double> d = new Genericcalculator<Double>();
		System.out.println("Maximum: " + d.CalculateMaximum(arr2));
		System.out.println("Product: " + d.calculateProduct(arr2));
	}
}
