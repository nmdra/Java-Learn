package Tutorials.Tutorial_4.Tute4ex2Ext;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Double> prices;

    public ShoppingCart() {
        prices = new ArrayList<>();
    }

    public void addItem(double price) {
        try {
            if (price < 0) {
                throw new IllegalArgumentException("Price cannot be negative.");
            }

            prices.add(price);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public double calculateTotalPrice() {
        try {
            if (prices.isEmpty()) {
                throw new IllegalStateException("Cart is empty. Cannot calculate total price.");
            }

            double total = 0;

            for (Double price : prices) {
                total += price;
            }

            return total;

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
            return 0.0;
        }
    }

    public void showItemPrice(){
        int count = 1;
        for(Double price : prices){
            System.out.println("Item " + count++ + " = " + price);
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(20.0);
        cart.addItem(30.0);

        cart.showItemPrice();
        System.out.println("Total Price: " + cart.calculateTotalPrice());
    }
}
