package shopTask;

public class ProductOfQ extends Product {
	
	private int quantity;

	public ProductOfQ(String nameOfProduct, double price, int quantity) {
		super(nameOfProduct, price);
		this.setQuantity(quantity);
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity >= 0) {
			this.quantity = quantity;
		} else {
			System.out.println("Enter a valid quantity!");
		}
	}
}
