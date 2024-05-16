package PastPapers.Y19OctVerB.Q04;

public class RoboFest implements IFestival {
    @Override
    public void performEvent() {
        System.out.println("Perform RoboFest Event for " + getBudget());
    }

    @Override
    public double getBudget() {
        return 800000.00;
    }
}
