package PastPapers.Y22NovVerA.Q04;

public class Breakfast extends Meal {

    @Override
    public void displayMeal() {
        System.out.println("Preparing BreakFast");
        mealWithFlavour();
        mealInDuration();
        displayCost();
    }

    @Override
    public void displayCost() {
        System.out.println("Cost for the meal is = " + iPrepareDeliciously.getCost());
    }
}
