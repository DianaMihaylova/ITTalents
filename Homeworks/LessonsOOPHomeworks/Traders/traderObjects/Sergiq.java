package traderObjects;

public class Sergiq extends TraderObject implements IETTO {

	public Sergiq(String address, String workTime, double area) {
		super(address, workTime, area, 50);
	}

	@Override
	public boolean validateArea(double area) {
		if (area >= 2 && area <= 10) {
			return true;
		}
		return false;
	}
}
