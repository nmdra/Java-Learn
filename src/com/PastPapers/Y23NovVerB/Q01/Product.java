package PastPapers.Y23NovVerB.Q01;

public class Product {

	private int productID;
	private String name;
	private double price;
	private int stock ;

	public Product() {

	}

	public Product(int productID, String name, double price, int stock) {
		this.productID = productID;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public void Read(int productID, String name, double price, int stock) {
		this.productID = productID;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void Display() {

		System.out.println("Product id : " + productID);
		System.out.println("Product name : " + name);
		System.out.println("Product price : " + price);
		System.out.println("Product quantity : " + stock + "\n");
	}
}
