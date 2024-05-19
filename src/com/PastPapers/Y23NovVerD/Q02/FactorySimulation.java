package PastPapers.Y23NovVerD.Q02;

public class FactorySimulation {
    private int ironInventory = 0;
    private int woodInventory = 0;
    private int cementInventory = 0;

    public  void addIron() {
        ironInventory++;
        System.out.println("Supplied 1 Iron. Iron Inventory: " + ironInventory);
    }

    public  void addWood() {
        woodInventory++;
        System.out.println("Supplied 1 Wood. Wood Inventory: " + woodInventory);
    }

    public  void addCement() {
        cementInventory++;
        System.out.println("Supplied 1 Cement. Cement Inventory: " + cementInventory);
    }

    public  void produceProduct() {
        while (ironInventory < 1 || woodInventory < 2 || cementInventory < 1) {
            System.out.println("Waiting for supplies...");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ironInventory--;
        woodInventory -= 2;
        cementInventory--;
        System.out.println("Product produced. Iron: " + ironInventory + ", Wood: " + woodInventory + ", Cement: " + cementInventory);
    }
}
