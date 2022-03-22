
public class DigitalBook extends Book{
	private String url;

	public DigitalBook(int price, String title) {
		super(price, title);
	}

	@Override//polymorphism
	public void deposit() {
		super.deposit();
		//extra logic
		deductCharges();
	}
	private void deductCharges() {
		System.out.println("deducted");
	}

	public String getUrl() {
		return url;
	}
}
