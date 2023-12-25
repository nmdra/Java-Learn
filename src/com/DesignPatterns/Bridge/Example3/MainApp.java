package DesignPatterns.Bridge.Example3;

import DesignPatterns.Bridge.Example3.abstractions.AmericanRestaurant;
import DesignPatterns.Bridge.Example3.abstractions.ItalianRestaurant;
import DesignPatterns.Bridge.Example3.abstractions.Restaurant;
import DesignPatterns.Bridge.Example3.implementations.PepperoniPizza;
import DesignPatterns.Bridge.Example3.implementations.VeggiePizza;;

public class MainApp {

    public static void main(String[] args) {

        Restaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();

        System.out.println("==========================================");

        Restaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();

    }
}
