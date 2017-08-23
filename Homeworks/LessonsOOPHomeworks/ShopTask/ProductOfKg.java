package shopTask;

public class ProductOfKg extends Product {
	
	private double quantity;

	public ProductOfKg(String nameOfProduct, double price, double quantity) {
		super(nameOfProduct, price);
		this.setQuantity(quantity);
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		if (quantity >= 0) {
			this.quantity = quantity;
		} else {
			System.out.println("Enter a valid quantity!");
		}
	}
}
