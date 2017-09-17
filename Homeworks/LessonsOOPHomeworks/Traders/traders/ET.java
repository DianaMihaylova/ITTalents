package traders;

import java.util.ArrayList;

import providers.ProvDrebno;
import traderObjects.IETTO;
import traderObjects.Product;

public class ET extends Trader {
	
	private ProvDrebno[] provDrebno;
	private IETTO traderObject;

	public ET(String name, String address, double capital) {
		super(name, address, capital);
		this.provDrebno = new ProvDrebno[5];
	}
	
	public void setTraderObject(IETTO traderObject) {
		if (traderObject != null) {
			this.traderObject = traderObject;
		}
	}

	public IETTO getTraderObject() {
		return traderObject;
	}

	@Override
	protected void addProducts(ArrayList<Product> products) {
		if (this.traderObject != null) {
			this.traderObject.acceptProducts(products);
		}
	}

	@Override
	protected void removeProducts() {
		if (this.traderObject != null) {
			this.traderObject.removeProducts();
		}
	}
}
