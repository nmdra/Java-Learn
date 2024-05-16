package DesignPatterns.Command.Example3;

public class KitchenLight implements Light {

	@Override
	public void on() {
		System.out.println("Kitchen Light On");
	}

	@Override
	public void off() {
		System.out.println("Kitchen Light Off");
	}

}
