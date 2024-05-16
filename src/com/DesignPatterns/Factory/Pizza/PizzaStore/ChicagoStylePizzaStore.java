package DesignPatterns.Factory.Pizza.PizzaStore;

import DesignPatterns.Factory.Pizza.Pizza.ChicagoStylePizza.ChicagoStyleCheesePizza;
import DesignPatterns.Factory.Pizza.Pizza.ChicagoStylePizza.ChicagoStyleClamPizza;
import DesignPatterns.Factory.Pizza.Pizza.ChicagoStylePizza.ChicagoStyleVeggiePizza;
import DesignPatterns.Factory.Pizza.Pizza.Pizza;

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
