package PastPapers.Y23NovVerB.Q04;

import DesignPatterns.AbstractFactory.Example2.Circle;

public class CircleShapes implements IDrawableShapes {

    private static CircleShapes instance;

    private CircleShapes(){}

    public static CircleShapes getInstance(){
        if (instance == null){
            instance = new CircleShapes();
        }
        return instance;
    }

    @Override
    public void drawShapes(String robotType) {
        System.out.print("Draw Circle Shapes on clothes by "+robotType+" Robot\n");
    }
}
