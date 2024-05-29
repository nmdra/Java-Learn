package PastPapers.Y23NovVerB.Q01;

public class OrderProcessingApp {

	public static void main(String[] args) {
		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();
		Product product4 = new Product();

		Order order1 =new Order(1,"kamal","28-05-2023");
		Order order2 =new Order(2,"nimal", "28-06-2023");

		product1.Read(01,"pen", 25.0 , 10);
		product1.Display();
		product2.Read(02,"pencil" , 40.0 , 20);
		product2.Display();
		product3.Read(03,"bag",1500.0, 10);
		product3.Display();
		product4.Read(04, "bottle", 250, 10);
		product4.Display();

		order1.addProduct(product1);
		order1.addProduct(product4);
		order1.addProduct(product2);

		order2.addProduct(product2);
		order2.addProduct(product1);
		order2.addProduct(product3);

		order1.processOrder();
		order2.processOrder();
	}
}
