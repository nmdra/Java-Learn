package DesignPatterns.Strategy.Example2;

public class Quack implements IQuackBehaviour{

	@Override
	public void quack() {
		System.out.println("Quack..Quack...");
	}
}


