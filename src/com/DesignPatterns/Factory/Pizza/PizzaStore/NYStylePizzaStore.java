package DesignPatterns.Factory.Pizza.PizzaStore;

import DesignPatterns.Factory.Pizza.Pizza.NYStylePizza.NYStyleCheesePizza;
import DesignPatterns.Factory.Pizza.Pizza.NYStylePizza.NYStyleClamPizza;
import DesignPatterns.Factory.Pizza.Pizza.NYStylePizza.NYStyleVeggiePizza;
import DesignPatterns.Factory.Pizza.Pizza.Pizza;

/**
 * @author Nitin
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
