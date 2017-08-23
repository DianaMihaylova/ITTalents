package shopTask;

import java.util.ArrayList;
import java.util.List;

public class Shop {
	
	private String nameOfShop;
	private String address;
	private double moneyOfCash;
	private List<Product> products;
	private int maxProductsOfShop;
	
	public Shop(String nameOfShop, String address, double moneyOfCash) {
		this.setNameOfShop(nameOfShop);
		this.setAddress(address);
		this.setMoneyOfCash(moneyOfCash);
		this.setProducts(new ArrayList<Product>());
		this.setMaxProductsOfShop(1000);
	}
	
	public String getNameOfShop() {
		return nameOfShop;
	}
	
	public void setNameOfShop(String nameOfShop) {
		if (nameOfShop != null && nameOfShop != "") {
			this.nameOfShop = nameOfShop;
		} else {
			System.out.println("Enter a valid name!");
		}
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		if (address != null && address != "") {
			this.address = address;
		} else {
			System.out.println("Enter a valid address!");
		}
	}
	
	public double getMoneyOfCash() {
		return moneyOfCash;
	}
	
	public void setMoneyOfCash(double moneyOfCash) {
		if (moneyOfCash >= 100) {
			this.moneyOfCash = moneyOfCash;
		} else {
			System.out.println("Enter a valid money!");
		}
	}
	
	public List<Product> getProducts() {
		return products;
	}
	
	public void setProducts(List<Product> products) {
		if (products != null) {
			this.products = products;
		} else {
			System.out.println("Enter a valid product!");
		}
	}
	
	public int getMaxProductsOfShop() {
		return maxProductsOfShop;
	}

	public void setMaxProductsOfShop(int maxProductsOfShop) {
		if (maxProductsOfShop > 0) {
			this.maxProductsOfShop = maxProductsOfShop;
		}
	}

	public void addProductsKg(ProductOfKg productKg) {
		if (maxProductsOfShop > 0 && productKg != null) {
			products.add(productKg);
			maxProductsOfShop--;
			System.out.println(productKg.getNameOfProduct() + " has been added to " + this.getNameOfShop());
		} else {
			System.out.println("There is no more free places or the product is not valid!");
		}
		System.out.println("--------------------------");
	}
	
	public void addProductsQ(ProductOfQ productQ) {
		if (maxProductsOfShop > 0) {
			products.add(productQ);
			maxProductsOfShop--;
			System.out.println(productQ.getNameOfProduct() + " has been added to " + this.getNameOfShop());
		} else {
			System.out.println("There is no more free places!");
		}
		System.out.println("--------------------------");
	}
	
	public void showInfoForShop() {
		if (products.isEmpty()) {
			System.out.println("There is no products!");
		} else {
			System.out.println("Magazine: " + this.getNameOfShop());
			System.out.println();
			for (int i = 0; i < this.products.size(); i++) {
				System.out.println("Product: " + products.get(i).getNameOfProduct());
				System.out.println("Price: " + products.get(i).getPrice());
				if (products.get(i) instanceof ProductOfKg) {
					System.out.println("Quantity of kg: " + ((ProductOfKg) products.get(i)).getQuantity());
				} else {
					System.out.println("Quantity of pieces: " + ((ProductOfQ) products.get(i)).getQuantity());
				}
				System.out.println();
			}
		}
		System.out.println("--------------------------");
	}
}
