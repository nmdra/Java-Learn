package DesignPatterns.Factory.FactoryMethod2;

public abstract class Restaurant {
    public void orderBurger() {
        System.out.println("Ordering Burger...");
        Burger burger = createBurger();
        burger.prepare();
    }

    public abstract Burger createBurger();
}
