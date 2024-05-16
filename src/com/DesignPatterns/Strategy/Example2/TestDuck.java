package DesignPatterns.Strategy.Example2;

public class TestDuck {
	public static void main(String[] args) {

		System.out.println("Start Mallard Duck");
		System.out.println("==================");
		Duck mallard = new MollardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		System.out.println("Start Model Duck");
		System.out.println("==================");
		Duck model = new ModelDuck();
		
		model.performFly();
		model.setFlyBehaviour(new FlyRocketPower());
		model.performFly();
		
		model.performQuack();
		model.setQuackBehaviour(new ModelQuack());
		model.performQuack();
	}
}
