package DesignPatterns.Strategy.Example2;

public abstract class Duck {
	
	IFlyBehaviour flyBehaviour;
	
	IQuackBehaviour quackBehaviour;
	
	public abstract void display();
	
	public void performFly(){
		flyBehaviour.fly();
	}
	
	public void performQuack(){
		quackBehaviour.quack();
	}

	public void setFlyBehaviour(IFlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public void setQuackBehaviour(IQuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
}
