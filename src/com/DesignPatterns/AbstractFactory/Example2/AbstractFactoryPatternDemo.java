package DesignPatterns.AbstractFactory.Example2;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        assert shapeFactory != null;
        Shape shape = shapeFactory.getShape("CIRCLE");
		shape.draw();
		
		FactoryProducer.getFactory("SHAPE").getShape("RECTANGLE").draw();
		FactoryProducer.getFactory("SHAPE").getShape("SQUARE").draw();
		
		FactoryProducer.getFactory("COLOR").getColor("RED").fill();
		FactoryProducer.getFactory("COLOR").getColor("GREEN").fill();
		FactoryProducer.getFactory("COLOR").getColor("BLUE").fill();
	}
}
