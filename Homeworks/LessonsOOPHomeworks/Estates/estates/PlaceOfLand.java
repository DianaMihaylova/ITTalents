package estates;

public class PlaceOfLand extends Estate {
	
	public enum TypeOfPanel {FIELD, MEADOW, FOREST};
	
	private boolean isInRegulation;
	private TypeOfPanel type;
	
	public PlaceOfLand(String description, String address, double price, double area, boolean isInRegulation, TypeOfPanel type) {
		super(description, address, price, area);
		this.isInRegulation = isInRegulation;
		this.category = Category.PANEL;
		this.type = type;
	}

	@Override
	protected boolean validPrice(double price) {
		if (price >= 30000 && price <= 85000) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return super.toString() + " type=" + type + "]";
	}
}
