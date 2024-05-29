package PastPapers.Y23NovVerB.Q01;

import java.util.ArrayList;

public class Order {
	private int orderID;
	private String cus_name;
	private String orderdate;
	ArrayList <Product> product;

	public Order() {}
    
    public Order(int orderID, String cus_name, String orderdate) {
    	product = new ArrayList<>();
		this.orderID = orderID;
		this.cus_name = cus_name;
		this.orderdate = orderdate;
	}
	
    public void addProduct(Product p) {
    	product.add(p);
    }
    
    public void processOrder() {
    	System.out.println("Order ID : " + orderID);
    	System.out.println("Customer name : " + cus_name);
    	System.out.println("order Date : " + orderdate);
    	System.out.println("selected product : " );
    	for (Product p : product) {
    		System.out.println(p.getName());
    	}
    }
}
