package traders;

import java.util.ArrayList;

import providers.ProvDrebno;
import traderObjects.Product;

public class Ambulanten extends Trader {
	
	private ProvDrebno provDrebno;
	private ArrayList<Product> products;
	

	public Ambulanten(String name, String address, double capital) {
		super(name, address, capital);
	}

	@Override
	protected void addProducts(ArrayList<Product> products) {
		if (!products.isEmpty()) {
			this.products = products;
		}
	}

	@Override
	protected void removeProducts() {
		this.products = null;
	}
}
