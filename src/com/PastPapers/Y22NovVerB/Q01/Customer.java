package PastPapers.Y22NovVerB.Q01;

public abstract class Customer {
    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public abstract void calculateBill();
}
