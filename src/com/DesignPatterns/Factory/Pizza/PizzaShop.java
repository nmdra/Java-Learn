package DesignPatterns.Factory.Pizza.pizzashop;

import Pizza.Pizza;
import PizzaStore.NYStylePizzaStore;
import PizzaStore.PizzaStore;

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
