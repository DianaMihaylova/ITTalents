package traderObjects;

public class Budka extends TraderObject implements IETTO, ITurgVeriga {

	public Budka(String address, String workTime, double area) {
		super(address, workTime, area, 50);
	}

	@Override
	public boolean validateArea(double area) {
		if (area >= 4 && area <= 6) {
			return true;
		}
		return false;
	}
}
