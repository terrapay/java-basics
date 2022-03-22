
public class DigitalBook extends Book{
	private String url;

	public DigitalBook(int price, String title) {
		super(price, title);
	}

	public String getUrl() {
		return url;
	}
}
