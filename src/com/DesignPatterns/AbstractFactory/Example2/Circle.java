package DesignPatterns.AbstractFactory.Example2;

public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside the Circle:draw() method");
	}
}
