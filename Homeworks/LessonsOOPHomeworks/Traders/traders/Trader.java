package traders;

import java.util.ArrayList;
import java.util.Random;

import providers.Provider;
import traderObjects.Product;
import traderObjects.TraderObject;

public abstract class Trader {
	
	private String name;
	private String address;
	private double capital;
	private double allPurchases;
	
	public Trader(String name, String address, double capital) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
		if (address != null && !address.isEmpty()) {
			this.address = address;
		}
		if (capital > 2) {
		   this.capital = capital;
		}
	}
	
	public double getCapital() {
		return capital;
	}

	public String getName() {
		return name;
	}

	public void makeOrder(double money, Provider provider) {
		if (money <= this.capital / 2) {
			ArrayList<Product> purchases = new ArrayList<>();
			int index = 0;
			double priceForAllProducts = 0;
			while (money > priceForAllProducts) {
				Product p = generateProducts();
				purchases.add(index++, p);
				priceForAllProducts += p.getPrice();
			}
			System.out.println(purchases);
			System.out.println("Price of all products: " + priceForAllProducts);
			this.capital -= priceForAllProducts*((100-provider.discount())/100);
			addProducts(purchases);
			this.allPurchases += priceForAllProducts;
		} else {
			System.out.println("The order is more than 50% of the trader's capital");
			return;
		}	
	}
	
	protected abstract void addProducts(ArrayList<Product> products);
	
	protected abstract void removeProducts();

	public void collectMoney() {
		this.capital += (this.allPurchases * 1.3) - this.allPurchases;
		removeProducts();
		this.allPurchases = 0;
	}

	public void payTax(TraderObject tradeObject) {
		if (tradeObject != null) {
			this.capital -= tradeObject.getTax();
		}
	}
	
	private Product generateProducts() {
		String[] name = {"Krastavica", "Meso", "Plodove", "Shokolad", "Sladoled", "Domati", "Hlqb"};
		double[] price = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		Product newProduct = new Product(name[new Random().nextInt(name.length)], price[new Random().nextInt(price.length)]);
		return newProduct;
	}
}
