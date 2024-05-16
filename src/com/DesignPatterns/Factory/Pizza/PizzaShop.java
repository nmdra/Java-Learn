package DesignPatterns.Factory.Pizza;

import DesignPatterns.Factory.Pizza.Pizza.Pizza;
import DesignPatterns.Factory.Pizza.PizzaStore.NYStylePizzaStore;
import DesignPatterns.Factory.Pizza.PizzaStore.PizzaStore;

/**
 * @author nitin
 */
public class PizzaShop {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("You ordered a " + pizza.getName());
    }

}
