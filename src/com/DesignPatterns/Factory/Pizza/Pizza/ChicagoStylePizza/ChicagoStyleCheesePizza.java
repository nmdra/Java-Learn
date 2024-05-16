package DesignPatterns.Factory.Pizza.Pizza.ChicagoStylePizza;

import DesignPatterns.Factory.Pizza.Pizza.Pizza;

/**
 * @author Nitin
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago style cheese Pizza";
        dough = "Thick crust";
        sauce = "Plum tomato sauce";
        toppings.add("cheese");
    }
}