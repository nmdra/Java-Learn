package PastPapers.Y22NovVerA.Q04;

public class Lunch extends Meal {

    @Override
    public void displayMeal() {
        System.out.println("Preparing Lunch");
        mealWithFlavour();
        mealWithFlavour();
        displayCost();
    }

    @Override
    public void displayCost() {
        System.out.println("Cost for the Meal is = " + iPrepareDeliciously.getCost() );
    }
}
