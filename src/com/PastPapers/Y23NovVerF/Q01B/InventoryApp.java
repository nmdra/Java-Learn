package PastPapers.Y23NovVerF.Q01B;

public class InventoryApp {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addProduct("p1", "Cake",10, 1000.0);
        inventory.addProduct("p2", "Cookies",11, 500.0);
        inventory.addProduct("p3", "Ice Cream",12, 400.0);
        inventory.addProduct("p4", "Gelato",13, 600.0);
        inventory.addProduct("p5", "Pudding",14, 800.0);

//        inventory.displayProducts();

        // Alternate Method
        inventory.displayProducts2();
    }
}
