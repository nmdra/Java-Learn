package DesignPatterns.Bridge.Example1;

public class Demo {
	
	public static void main (String args[]) {
		
		AutoMobile bus = new Bus(new Produce(), new Assemble());
		bus.manufacture();
	}
}
