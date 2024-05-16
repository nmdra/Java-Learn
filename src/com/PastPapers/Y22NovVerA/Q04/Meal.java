package PastPapers.Y22NovVerA.Q04;

public abstract class Meal {
    IPrepareDeliciously iPrepareDeliciously;
    IPrepareQuickly iPrepareQuickly;

    public void setFlavour(IPrepareDeliciously iPrepareDeliciously) {
        this.iPrepareDeliciously = iPrepareDeliciously;
    }

    public void setDuration(IPrepareQuickly iPrepareQuickly) {
        this.iPrepareQuickly = iPrepareQuickly;
    }

    public void mealWithFlavour(){
        iPrepareDeliciously.addFlavour();
    }

    public void mealInDuration(){
        iPrepareQuickly.deliveryTime();
    }

    public abstract void displayMeal();

    public abstract void displayCost();
}
