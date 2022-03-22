import static org.junit.Assert.*;

import org.junit.Test;

public class BookTest {

	@Test
	public void testIssue() {
		// Arrange
		Book book = new Book(200F, "Tata steel");
		book.status = STATUS.available;
		// act
		book.issue();
		// assert
		assertEquals(STATUS.issued, book.status);
	}

	
	@Test(expected = IllegalStateException.class)
	public void testIssueWhenStatusIsDamaged() {
		// Arrange
		Book book = new Book(200F, "Tata steel");
		book.status = STATUS.damaged;
		// act
		book.issue();
	}
	@Test
	public void testDeposit() {
		Book book = new Book();
		book.status = STATUS.issued;
		book.deposit();
		assertEquals(STATUS.available, book.status);
	}
}
