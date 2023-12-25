package DesignPatterns.Template.Example1;

public class Coffee extends Beverages {

	@Override
	void brew() {
		System.out.println("Stripping coffe through filter");
	}

	@Override
	void addCondiments() {
		System.out.println("Add Suger and milk");
	}
}
