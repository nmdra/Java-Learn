package DesignPatterns.Template.Example1;

public abstract class Beverages {

	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("Boiling Water");
	}
	
	void pourInCup() {
		System.out.println("Pour into cup");
	}

	public final void PrepareRecipe() {

		boilWater();
		brew();
		addCondiments();
		pourInCup();

	}

}
