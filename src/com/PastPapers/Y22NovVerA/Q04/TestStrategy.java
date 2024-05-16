package PastPapers.Y22NovVerA.Q04;

public class TestStrategy {
    public static void main(String[] args) {
        Meal meal = new Breakfast();
        meal.setFlavour(new ChickenFlavour());
        meal.setDuration(new ThirtyMinutes());
        meal.displayMeal();

        System.out.println();

        Meal meal2 = new Lunch();
        meal2.setFlavour(new FishFlavour());
        meal2.setDuration(new OneHour());
        meal2.displayMeal();

        System.out.println();

        Meal meal3 = new Dinner();
        meal3.setFlavour(new EggFlavour());
        meal3.setDuration(new FortyFiveMinutes());
        meal3.displayMeal();
    }

}
