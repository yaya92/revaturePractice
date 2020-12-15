package eg1;

public class Product {
	
	String name;// global instance
	double price;// global instance variable
	static float discount = 5.5f;// global class level vriable
	
	public static void main(String [] args) {
		
		Product p1 = new Product();
		p1.name = "Television";
		p1.price =67.89;
		System.out.println("Printing p1");
		p1.printProduct();
		 discount = 7.25f;
		 
		 Product p2 = new Product();
			p2.name = "washing machine";
			p2.price =69.89;
			System.out.println("Printing p2");
			p2.printProduct();
			
			System.out.println("printing p1 again");
			p1.printProduct();
			 
		 
		
	}
	public void printProduct() {
		System.out.println("Product Name = " +name);
		System.out.println("Product price = " +price);
		System.out.println("Discount = "+discount);
	}
}
