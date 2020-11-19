
public class TestBook {
	public static void main(String[] args) {
		Author a1 = new Author("Author1","a1@author.com", 'm');
	    System.out.println(a1);
	    System.out.println("**********************");
		Book b1 = new Book("Volume1", a1, 15.10,2000);
		

		System.out.println("Book: " + b1.toString());
		System.out.println("Price: " + b1.getPrice());
		System.out.println("qty: " + b1.getQty());

		b1.setPrice(14.95);
		b1.setQty(900);
		System.out.println("Set");
		System.out.println("New Price: " + b1.getPrice());
		System.out.println("New Qty: " + b1.getQty());
	}
}
