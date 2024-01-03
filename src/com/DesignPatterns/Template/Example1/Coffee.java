package DesignPatterns.Template.Example1;

public class Coffee extends Beverages {

	@Override
	void brew() {
		System.out.println("Stripping coffee through filter");
	}

	@Override
	void addCondiments() {
		System.out.println("Add Sugar and milk");
	}
}
