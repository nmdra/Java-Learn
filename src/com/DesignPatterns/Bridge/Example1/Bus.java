package DesignPatterns.Bridge.Example1;

public class Bus extends AutoMobile {

	protected Bus(WorkShop workshop1, WorkShop workshop2) {
		super(workshop1, workshop2);
	}

	public void manufacture() {
		
		System.out.println("Taxi is ");
		workshop1.work();
		workshop2.work();
	}
}
