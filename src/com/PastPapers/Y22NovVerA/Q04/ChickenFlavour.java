package PastPapers.Y22NovVerA.Q04;

public class ChickenFlavour implements IPrepareDeliciously{

    double costChicken = 100.00;

    @Override
    public void addFlavour() {
        System.out.println("Added Chicken Flavour");
    }

    @Override
    public double getCost() {
        return costChicken;
    }
}
