package PastPapers.Y19OctVerB.Q04;

public class CodeFest implements IFestival {
    @Override
    public void performEvent() {
        System.out.println("Perform CodeFest Event for " + getBudget());
    }

    @Override
    public double getBudget() {
        return 300000.00;
    }
}
