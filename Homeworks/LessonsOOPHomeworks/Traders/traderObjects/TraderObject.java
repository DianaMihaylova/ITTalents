package traderObjects;

import java.util.ArrayList;

public abstract class TraderObject {
	
	private String address;
	private String workTime;
	protected double area;
	private double tax;
	private ArrayList<Product> products;
	
	public TraderObject(String address, String workTime, double area, int tax) {
		if (address != null && !address.isEmpty()) {
			this.address = address;
		}
		if (workTime != null && !workTime.isEmpty()) {
			this.workTime = workTime;
		}
		if (validateArea(area)) {
			this.area = area;
		}
		this.tax = tax;
	}
	
	public abstract boolean validateArea(double area);
	
	public void acceptProducts(ArrayList<Product> products) {
		if (!products.isEmpty()) {
			this.products = products;
		}
	}
	
	public void removeProducts() {
		this.products = null;
	}

	public double getTax() {
		return tax;
	}
}
