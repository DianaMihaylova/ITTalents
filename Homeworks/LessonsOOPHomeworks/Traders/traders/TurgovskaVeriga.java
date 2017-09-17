package traders;

import java.util.ArrayList;

import providers.Provider;
import traderObjects.ITurgVeriga;
import traderObjects.Product;

public class TurgovskaVeriga extends Trader {
	
	private Provider[] providers;
	private ITurgVeriga[] tradersObjects;
	private int objectLength;

	public TurgovskaVeriga(String name, String address, double capital) {
		super(name, address, capital);
		this.providers = new Provider[15];
		this.tradersObjects = new ITurgVeriga[10];
	}
	
	public void setTradersObjects(ITurgVeriga tradersObjects) {
		if (objectLength < this.tradersObjects.length) {
			this.tradersObjects[objectLength++] = tradersObjects;
		}
	}

	public ITurgVeriga[] getTradersObjects() {
		return tradersObjects;
	}

	@Override
	protected void addProducts(ArrayList<Product> products) {
		for (int i = 0; i < tradersObjects.length; i++) {
			if (tradersObjects[i] != null) {
				tradersObjects[i].acceptProducts(products);
			}
		}
	}

	@Override
	protected void removeProducts() {
		for (int i = 0; i < tradersObjects.length; i++) {
			if (tradersObjects[i] != null) {
				tradersObjects[i].removeProducts();
			}
		}
	}
}
