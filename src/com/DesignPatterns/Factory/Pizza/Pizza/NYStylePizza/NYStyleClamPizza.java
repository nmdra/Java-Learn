package DesignPatterns.Factory.Pizza.Pizza.NYStylePizza;

import DesignPatterns.Factory.Pizza.Pizza.Pizza;

/**
 * @author nitin
 */
public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza() {
        name = "NY style Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }
}
