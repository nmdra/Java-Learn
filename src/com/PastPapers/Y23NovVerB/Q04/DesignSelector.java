package PastPapers.Y23NovVerB.Q04;

public abstract class DesignSelector {
    IDrawableShapes drawableShapes;
    IDrawableLines drawableLines;

    public void setDrawableShapes(IDrawableShapes drawableShapes) {
        this.drawableShapes = drawableShapes;
    }

    public void setDrawableLines(IDrawableLines drawableLines) {
        this.drawableLines = drawableLines;
    }

    abstract void designLines();
    abstract void designShapes();
}
