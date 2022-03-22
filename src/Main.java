
public class Main {
	private static void createBooks() {
		Book b1 = new Book(400F, "Learn HTML");
//		b1.price = 300F;
//		b1.title = "Learn Java";
		
		
		System.out.println(b1);
//		new Book(); //only object
		Book b2;//only ref
		b2 = new Book();
		
		b2.price = 300F;
		b2.title = "Learn Java";
		System.out.println(b2.id);
		b2.issue();
		System.out.println(b2.status);
		b2.deposit();
		System.out.println(b2.status);
	}
	
	public static void main(String[] args) {
		createBooks();
		
		System.out.println("Hello world");
		int age =10;
		String name = "Pariwesh";
		System.out.println(name);
	}
}
