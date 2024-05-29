package PastPapers.Y23NovVerB.Q01Alt;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Order {

	private String customerName;
	private int orderID;
	private String orderDate;
	
	PriorityQueue<Product> productQueue;

	/**
	 * Initializes a PriorityQueue with a custom comparator based on the name property of Product objects.
	 * <p>
	 * This line of code creates a PriorityQueue named productQueue. The PriorityQueue is initialized with
	 * a custom comparator that compares Product objects based on their name property. This comparator
	 * sorts Product objects in alphabetical order of their names.
	 * <p>
	 * {@code <Product>} the type of elements held in the PriorityQueue
	 * <p>
	 * {@code  Comparator.comparing(Product::getName)} a comparator that compares Product objects based on their name property
	 */
	public Order() {
		super();
		this.customerName = "";
		this.orderID = 0;
		this.orderDate = "";

		productQueue = new PriorityQueue<>(Comparator.comparing(Product::getName));
	}

	public Order(String customerName, int orderID, String orderDate) {
		super();
		this.customerName = customerName;
		this.orderID = orderID;
		this.orderDate = orderDate;
		productQueue = new PriorityQueue<>(Comparator.comparing(Product::getName));
	}

//	@Override
//	public int compareTo(MyClass other) {
//		return Integer.compare(this.value, other.value);
//	}

	public void addProduct(Product p) {
		productQueue.add(p);
	}
	
	public void processOrder() {
		System.out.println("Customer Name: " + customerName);
		System.out.println("Order ID: " + orderID);
		System.out.println("Order Date: " + orderDate);
		System.out.println("List of Products: ");
		
//        productQueue.forEach(product -> System.out.println("\t" + product.getName()));
		
		for(Product product:productQueue) {
			System.out.println("\t" + product.getName());
		}
	}
}
