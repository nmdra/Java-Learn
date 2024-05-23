package PastPapers.Y23NovVerF.Q01B;

public class Product {
    String Name;
    int quantityOfStocks;
    double pricePerUnit;

    Product(String name,int quantityOfStocks,double pricePerUnit){
        this.Name=name;
        this.quantityOfStocks=quantityOfStocks;
        this.pricePerUnit=pricePerUnit;
    }

    public void display(){
        System.out.println("Name: "+Name);
        System.out.println("Quantity of stocks: "+quantityOfStocks);
        System.out.println("Price per unit: "+pricePerUnit);
    }

}
