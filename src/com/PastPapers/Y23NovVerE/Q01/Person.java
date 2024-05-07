package PastPapers.Y23NovVerE.Q01;

public abstract class Person {
    int ID;
    String name;

    public Person(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public Person() {
        this.ID = 0;
        this.name = "";
    }

    abstract void DisplayDetails();

}
