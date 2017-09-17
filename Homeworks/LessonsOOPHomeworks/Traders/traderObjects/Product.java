package traderObjects;

public class Product {
	
	private String name;
	private double price;
	
	public Product(String name, double price) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
		if (price > 0) {
			this.price = price;
		}
	}
	
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}
