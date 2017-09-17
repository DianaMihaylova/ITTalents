package estates;

import agency.Agent;

public abstract class Estate implements Comparable<Estate> {
	
	public enum Category {APARTMENT, HOUSE, PANEL};
	private String description;
	private String address;
	private double price;
	private double area;
	private Agent agent;
	protected Category category;
	
	public Estate(String description, String address, double price, double area) {
		if (description != null && !description.isEmpty()) {
			this.description = description;
		}
		if (address != null && !address.isEmpty()) {
			this.address = description;
		}
		if (validPrice(price)) {
			this.price = price;
		}
		if (area > 0) {
			this.area = area;
		}
	}
	
	protected abstract boolean validPrice(double price);

	public double getPrice() {
		return price;
	}
	
	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		if (agent != null) {
			this.agent = agent;
		}
	}

	public Category getCategory() {
		return category;
	}
	
	@Override
	public int compareTo(Estate o) {
		double result = (this.getPrice() - o.getPrice()) * -1;
		if (result > 0) {
			return 1;
		} 
		if (result < 0) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "[Category=" + category + " Description=" + description + ", price=" + price + ", area=" + area + ", agent=" + agent;
	}
}
