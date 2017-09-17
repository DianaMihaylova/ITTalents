package estates;

public class Apartment extends Estate implements IConstruction {
	
	public enum TypeOfApartment {STUDIO, TWO_ROOM, THREE_ROOM, MAISONETTE};
	
	private TypeOfApartment type;
	private IConstruction.Construction constr;

	public Apartment(String description, String address, double price, double area, TypeOfApartment type, IConstruction.Construction constr) {
		super(description, address, price, area);
		this.category = Category.APARTMENT;
		this.type = type;
		this.constr = constr;
	}

	@Override
	protected boolean validPrice(double price) {
		if (price >= 70000 && price <= 150000) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return super.toString() + " type=" + type + ", constr=" + constr + "]";
	}
}
