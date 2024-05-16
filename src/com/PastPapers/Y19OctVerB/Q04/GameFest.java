package PastPapers.Y19OctVerB.Q04;

public class GameFest implements IFestival {
    @Override
    public void performEvent() {
        System.out.println("Perform GameFest Event for " + getBudget());
    }

    @Override
    public double getBudget() {
        return 400000.00;
    }
}
