package PastPapers.Y23NovVerB.Q04;

public class StraightLines implements IDrawableLines {

    private static StraightLines instance;

    private StraightLines() {}

    public static StraightLines getInstance(){
        if (instance == null){
            instance = new StraightLines();
        }
        return instance;
    }

    @Override
    public void drawLines(String robotType) {
        System.out.print("Draw Straight Lines on clothes by "+robotType+" Robot\n");
    }
}
