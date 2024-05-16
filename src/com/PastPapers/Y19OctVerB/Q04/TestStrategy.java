package PastPapers.Y19OctVerB.Q04;

public class TestStrategy {
    public static void main(String[] args) {
        Students poStudents = new PostGraduateStudents();
        poStudents.setFestival(new CodeFest());
        poStudents.setPrograms(new MScPrograms());
        poStudents.displayStudents();

        System.out.println();

        Students unStudents = new UndergraduteStudents();
        unStudents.setFestival(new RoboFest());
        unStudents.setPrograms(new BScPrograms());
        unStudents.displayStudents();

    }
}
