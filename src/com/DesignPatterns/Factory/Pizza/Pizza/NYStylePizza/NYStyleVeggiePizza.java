package DesignPatterns.Factory.Pizza.Pizza.NYStylePizza;

/**
 * @author nitin
 */
public class NYStyleVeggiePizza extends Pizza.Pizza {

    public NYStyleVeggiePizza() {
        name = "NY style Veggie Pizza";
        dough = "thick Crust";
        sauce = "Marinara sauce";
        toppings.add("Shredded mozzarella");
        toppings.add("Grated parmesan");
        toppings.add("Diced onion");
        toppings.add("Sliced mushrooms");
        toppings.add("Sliced red pepper");
        toppings.add("Sliced black olives");
    }
}
