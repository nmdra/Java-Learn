package PastPapers.Y23NovVerB.Q04;

public class DottedLines implements IDrawableLines {

    private static DottedLines instance;

    private DottedLines() {}

    public static DottedLines getInstance(){
        if (instance == null){
            instance = new DottedLines();
        }
        return instance;
    }

    @Override
    public void drawLines(String robotType) {
        System.out.print("Draw Dotted Lines on clothes by "+robotType+" Robot\n");
    }
}
