
public class Book {
	static int counter;
	int id;
	String title;
	float price;
	STATUS status; // issued, available, damaged

	public Book() {
//		new Book();
		this.id = ++counter;
	}

	public Book(float f, String title) {//custom constructor
		this.price=price;
		this.title = title;
	}

	public void issue() {
		this.status = STATUS.issued;
	}

	public void deposit() {
		if (status == STATUS.issued) {
			this.status = STATUS.available;
		}
	}

	@Override
	public String toString() {
		return this.title + this.status + this.price;
	}
}
