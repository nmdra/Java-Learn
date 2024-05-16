package PastPapers.Y19OctVerB.Q04;

public class PostGraduateStudents extends Students {
    @Override
    public void displayStudents() {
        offerPrograms();
        conductEvent();
        displayCost();
        System.out.println("Display PostGraduateStudents");
    }

    @Override
    public void displayCost() {
        System.out.println("Cost for the postgraduate program is = " + iPrograms.getCost());
    }
}
