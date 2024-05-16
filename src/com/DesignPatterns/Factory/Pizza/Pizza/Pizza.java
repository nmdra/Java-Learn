package DesignPatterns.Factory.Pizza.Pizza;

import java.util.ArrayList;

/*
 * @author nitin
 */
public abstract class Pizza {

    public String name;
    public String dough;
    public String sauce;
    public ArrayList<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("preparing " + name + " ...");
        System.out.println("Tossing dough ...");
        System.out.println("Addign sauce ...");
        System.out.println("Adding toppings ...");
        for (String topping : toppings) {
            System.out.println("  " + topping);
        }
    }

    public void bake() {
        System.out.println("Baking for 25 min");
    }

    public void cut() {
        System.out.println("Cutting in diagonal slices");
    }

    public void box() {
        System.out.println("boxing the pizza !!");
    }

    public String getName() {
        return name;
    }
}
