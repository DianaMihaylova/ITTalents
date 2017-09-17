package providers;

public class ProvDrebno extends Provider {

	public ProvDrebno(String name, String address, String workingTime) {
		super(name, address, workingTime);
	}

	@Override
	public int discount() {
		return 0;
	}
}
