package DesignPatterns.Template.Example1;

public class Demo {

	static Beverages beverages = null;
	
	public static void main(String[] args) {
		Beverages tea = new Tea();
		tea.PrepareRecipe();
		
		Beverages coffee = new Coffee();
		coffee.PrepareRecipe();
	}
}
