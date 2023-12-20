package DesignPatterns.Factory.FactoryMethod2;

public class MainApp {
    /**
     * Video Reference: https://youtu.be/EdFq_JIThqM
     */

    public static void main(String[] args) {

        Restaurant beefResto = new BeefBurgerRestaurant();
        beefResto.orderBurger();

        System.out.println("===============================");

        Restaurant veggieResto = new VeggieBurgerRestaurant();
        veggieResto.orderBurger();
    }
}