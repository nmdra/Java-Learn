package DesignPatterns.Template.Example1;

public class Tea extends Beverages {
	@Override
	void brew() {
		System.out.println("Steeping the tea");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding Lemon");
	}
}
