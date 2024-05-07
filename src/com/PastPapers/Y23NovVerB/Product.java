package PastPapers.Y23NovVerB;

public class Product {

		private int productID;
		private String name;
		private double price;
		private int stockQuantity;
		
		public Product(int productID, String name, double price, int stockQuantity) {
			super();
			this.productID = productID;
			this.name = name;
			this.price = price;
			this.stockQuantity = stockQuantity;
		}

		public Product() {
			super();
			this.productID = 0;
			this.name = "";
			this.price = 0.0;
			this.stockQuantity = 0;
		}
		
		public void Read(int productID, String name, double price, int stockQuantity) {
			this.name = name;
			this.price = price;
			this.productID = productID;
			this.stockQuantity = stockQuantity;
		}
		
		public void Display() {
			System.out.println("Product Name: " + name);
			System.out.println("Prodcut ID: " + productID);
			System.out.println("Price:" + price);
			System.out.println("Stock Quantity: " + stockQuantity);
		}

		public String getName() {
			return name;
		}

		
}
