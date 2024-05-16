package PastPapers.Y22NovVerA.Q04;

public class EggFlavour implements IPrepareDeliciously{

    double eggCost = 60.00;

    @Override
    public void addFlavour() {
        System.out.println("Added Egg Flavour");
    }

    @Override
    public double getCost() {
        return eggCost;
    }
}
