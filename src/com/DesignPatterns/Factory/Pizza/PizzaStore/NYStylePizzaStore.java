package DesignPatterns.Factory.Pizza.PizzaStore;

import Pizza.NYStylePizza.NYStyleCheesePizza;
import Pizza.NYStylePizza.NYStyleClamPizza;
import Pizza.NYStylePizza.NYStyleVeggiePizza;
import Pizza.Pizza;

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
