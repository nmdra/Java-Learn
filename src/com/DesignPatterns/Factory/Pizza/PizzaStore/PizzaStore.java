package DesignPatterns.Factory.Pizza.PizzaStore;

import DesignPatterns.Factory.Pizza.Pizza.Pizza;

/**
 * @author Nitin
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
