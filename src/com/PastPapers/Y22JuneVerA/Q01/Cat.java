package PastPapers.Y22JuneVerA.Q01;

public class Cat extends Pet {

    public Cat() {
        super();
    }

    @Override
    public void GetTotalPoints() {
        System.out.println("Total Point is " + getPoint());
    }

    @Override
    public void feed() {
        System.out.println("Feeding the cat");
        setPoint(getPoint()+5);
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the cat");
        setPoint(getPoint()+10);
    }

    @Override
    public void cuddle() {
        System.out.println("Cuddle the cat");
        setPoint(getPoint()+15);
    }
}
