package DesignPatterns.Template.Example1;

public class Demo {

	public static void main(String[] args) {
		Beverages tea = new Tea();
		tea.PrepareRecipe();
		
		Beverages coffee = new Coffee();
		coffee.PrepareRecipe();
	}
}
