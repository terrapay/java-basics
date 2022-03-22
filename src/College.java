
public class College {
	public static void main(String[] args) {
		Library library = new Library();
		Book book = new Book();
		library.addBook(book);
		DigitalBook digitalBook = new DigitalBook(200,"Learn javascript");
		System.out.println(digitalBook.getTitle());
		library.addBook(digitalBook);
	}
}
