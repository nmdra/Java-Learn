package PastPapers.Y23NovVerB.Q04;

public class SquareShapes implements IDrawableShapes {

    private static SquareShapes instance;

    private SquareShapes() {}

    public static SquareShapes getInstance(){
        if (instance == null){
            instance = new SquareShapes();
        }
        return instance;
    }

    @Override
    public void drawShapes(String robotType) {
        System.out.print("Draw Square Shapes on clothes by "+robotType+" Robot\n");
    }
}
