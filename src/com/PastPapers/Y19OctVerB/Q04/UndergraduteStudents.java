package PastPapers.Y19OctVerB.Q04;

public class UndergraduteStudents extends Students {

    @Override
    public void displayStudents() {
        offerPrograms();
        conductEvent();
        displayCost();
        System.out.println("Display undergraduate students");
    }

    @Override
    public void displayCost() {
        System.out.println("Cost for undergraduate program is = " + iPrograms.getCost());
    }
}
