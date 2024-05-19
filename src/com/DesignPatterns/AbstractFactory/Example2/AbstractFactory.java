package DesignPatterns.AbstractFactory.Example2;

public abstract class AbstractFactory {
	
	public abstract Color getColor(String type);
	
	public abstract Shape getShape(String type);
}
