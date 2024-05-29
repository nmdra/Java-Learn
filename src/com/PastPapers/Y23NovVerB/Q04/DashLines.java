package PastPapers.Y23NovVerB.Q04;

public class DashLines implements IDrawableLines {
    private static DashLines instance;

    private DashLines() {}

    public static DashLines getInstance(){
        if (instance == null){
            instance = new DashLines();
        }
        return instance;
    }

    @Override
    public void drawLines(String robotType) {
        System.out.print("Draw dash lines  on clothes by "+robotType+" Robot\n");
    }
}
