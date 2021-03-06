
public class Book implements IBook {
	private static int counter;
	private int id;

	private String title;// immutable, read only

	public String getTitle() {
		return title;
	}

	private float price;
	STATUS status; // issued, available, damaged

	public Book() {
//		new Book();
		this.id = ++counter;
	}

	public Book(float price, String title) {// custom constructor
		this();
		this.price = price;
		this.title = title;
	}

	public void issue() {
		if (this.status == STATUS.available) {
			this.status = STATUS.issued;
		}else {
			 throw new IllegalStateException("book is not issueable.");
		}
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		if (price <= 0) {
			throw new IllegalArgumentException("Price cannot be negative");
		}
		this.price = price;
	}

	public int getId() {
		return id;
	}
}
