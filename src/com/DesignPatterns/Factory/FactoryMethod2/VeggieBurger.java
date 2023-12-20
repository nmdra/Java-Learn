package DesignPatterns.Factory.FactoryMethod2;

public class VeggieBurger implements Burger {

    @Override
    public void prepare() {
        // Prepare Veggie Burger
        System.out.println("Preparing Veggie Burger...");
    }
}
