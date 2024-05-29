package PastPapers.Y23NovVerB.Q04;

public class TextileIndustryDemo {
    public static void main(String[] args) {
        DesignSelector japaneseRobot = new JapaneseRobot();
        japaneseRobot.setDrawableLines(DashLines.getInstance());
        japaneseRobot.designLines();
        japaneseRobot.setDrawableLines(DottedLines.getInstance());
        japaneseRobot.designLines();
        japaneseRobot.setDrawableLines(StraightLines.getInstance());
        japaneseRobot.designLines();

        DesignSelector chineseRobot = new ChineseRobot();
        chineseRobot.setDrawableShapes(CircleShapes.getInstance());
        chineseRobot.designShapes();
        chineseRobot.setDrawableShapes(SquareShapes.getInstance());
        chineseRobot.designShapes();
        chineseRobot.setDrawableShapes(TriangleShapes.getInstance());
        chineseRobot.designShapes();
    }
}
