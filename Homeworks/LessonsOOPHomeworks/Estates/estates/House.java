package estates;

public class House extends Estate implements IConstruction {
	
	public enum TypeOfHouse {FLOOR, WHOLE};
	
	private int parkPlaces;
	private double areaOfGarden;
	private TypeOfHouse type;
	private IConstruction.Construction constr;
	
	
	public House(String description, String address, double price, double area, int parkPlaces, double areaOfGarden, TypeOfHouse type, IConstruction.Construction constr) {
		super(description, address, price, area);
		if (parkPlaces > 0) {
			this.parkPlaces = parkPlaces;
		}
		if (areaOfGarden > 0) {
			this.areaOfGarden = areaOfGarden;
		}
		this.category = Category.HOUSE;
		this.type = type;
		this.constr = constr;
	}

	@Override
	protected boolean validPrice(double price) {
		if (price >= 50000 && price <= 80000) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return super.toString() + " type=" + type + ", constr=" + constr + "]";
	}
}
