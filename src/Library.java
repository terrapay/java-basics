import java.util.HashMap;
import java.util.Map;

public class Library {
	//composition
	public Map<Integer,Book> books = new HashMap();
	
	void addBook(Book book) {
		 books.put(book.getId(), book);
	}
}
