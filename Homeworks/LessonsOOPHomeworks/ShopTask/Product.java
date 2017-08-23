package shopTask;

public class Product {
	
	private String nameOfProduct;
	private double price;
	
	public Product(String nameOfProduct, double price) {
		this.setNameOfProduct(nameOfProduct);
		this.setPrice(price);
	}
	
	public String getNameOfProduct() {
		return nameOfProduct;
	}
	
	public void setNameOfProduct(String nameOfProduct) {
		if (nameOfProduct != null && nameOfProduct != "") {
			this.nameOfProduct = nameOfProduct;
		} else {
			System.out.println("Enter a valid name!");
			return;
		}
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("Enter a valid price!");
		}
	}
}
