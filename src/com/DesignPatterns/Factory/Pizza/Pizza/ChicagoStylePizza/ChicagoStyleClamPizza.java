package DesignPatterns.Factory.Pizza.Pizza.ChicagoStylePizza;

import Pizza.Pizza;

/**
 * @author Nitin
 */
public class ChicagoStyleClamPizza extends Pizza {

    public ChicagoStyleClamPizza() {
        name = "Chicago style Clam Pizza";
        dough = "Thick crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("cheese");
    }
}
