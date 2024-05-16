package DesignPatterns.Factory.Pizza.Pizza.ChicagoStylePizza;

import DesignPatterns.Factory.Pizza.Pizza.Pizza;

/**
 * @author Nitin
 */
public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        name = "Chicago style Veggie Pizza";
        dough = "thick Crust";
        sauce = "Maggie sauce";
        toppings.add("Shredded mozzarella");
        toppings.add("cheese");
        toppings.add("onion");
        toppings.add("big mushrooms");
    }
}
