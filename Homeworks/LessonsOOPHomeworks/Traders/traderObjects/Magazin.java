package traderObjects;

public class Magazin extends TraderObject implements ITurgVeriga {

	public Magazin(String address, String workTime, double area) {
		super(address, workTime, area, 150);
	}

	@Override
	public boolean validateArea(double area) {
		if (area >= 10 && area <= 100) {
			return true;
		}
		return false;
	}
}
