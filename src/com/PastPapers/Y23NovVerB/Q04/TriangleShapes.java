package PastPapers.Y23NovVerB.Q04;

public class TriangleShapes implements IDrawableShapes {

    private static TriangleShapes instance;

    private TriangleShapes() {}

    public static TriangleShapes getInstance(){
        if (instance == null){
            instance = new TriangleShapes();
        }
        return instance;
    }


    @Override
    public void drawShapes(String robotType) {
        System.out.print("Draw Triangle Shapes on clothes by "+robotType+" Robot\n");
    }
}
