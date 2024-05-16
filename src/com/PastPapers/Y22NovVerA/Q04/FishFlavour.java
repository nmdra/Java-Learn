package PastPapers.Y22NovVerA.Q04;

public class FishFlavour implements IPrepareDeliciously{
    double fishCost = 80.00;

    @Override
    public void addFlavour() {
        System.out.println("Added Fish Flavour");
    }

    @Override
    public double getCost() {
        return fishCost;
    }
}
