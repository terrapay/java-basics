import java.util.ArrayList;
import java.util.List;

public class Library {
	//composition
	List<Book> books = new ArrayList<>();
	
	boolean addBook(Book book) {
		return books.add(book);
	}
}
