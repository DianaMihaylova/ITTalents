package providers;

public class ProvEdro extends Provider {

	public ProvEdro(String name, String address, String workingTime) {
		super(name, address, workingTime);
	}

	@Override
	public int discount() {
		return 15;
	}
}
