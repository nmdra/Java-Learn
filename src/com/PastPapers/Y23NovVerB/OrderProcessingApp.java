package PastPapers.Y23NovVerB;

public class OrderProcessingApp {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		
		Order order1 = new Order("Sameera", 1234, "2024-05-01");
		Order order2 = new Order("Pubudi", 1256, "2024-05-04");
		
		p1.Read(11, "Pen", 30.0, 100);
		p2.Read(12, "Pencil", 40.0, 50);
		p3.Read(13, "Book", 200.0, 20);
		p4.Read(14, "Eraser", 20.0, 100);
		
		order1.addProduct(p1);
		order1.addProduct(p2);
		
		order2.addProduct(p3);
		order2.addProduct(p4);
		
		order1.processOrder();
		order2.processOrder();
		
	}
}
