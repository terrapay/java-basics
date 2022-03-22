import java.util.Comparator;

public class College {
	public static void main(String[] args) {
		Library library = new Library();
		Book book = new Book(300, "Laran Java");
		library.addBook(book);
		DigitalBook digitalBook = new DigitalBook(200,"Learn javascript");
		System.out.println(digitalBook.getTitle());
		library.addBook(digitalBook);
		
		//sort the books in ascending order of price
		System.out.println(library.books);
//		library.books.sort(new Comparator<Book>() {
//
//			@Override
//			public int compare(Book book1, Book book2) {
//				return -((int)book1.getPrice()-(int)book2.getPrice());
//			}
//		});
		
		System.out.println(library.books);
	}
}
