package DesignPatterns.Factory.Pizza.PizzaStore;

import Pizza.ChicagoStylePizza.ChicagoStyleCheesePizza;
import Pizza.ChicagoStylePizza.ChicagoStyleClamPizza;
import Pizza.ChicagoStylePizza.ChicagoStyleVeggiePizza;
import Pizza.Pizza;

/**
 * @author Nitin
 */
public class ChicagoStylePizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else {
            return null;
        }
    }

}
