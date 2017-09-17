package providers;

public abstract class Provider {
	
	private String name;
	private String address;
	private String workingTime;
	
	public Provider(String name, String address, String workingTime) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
		if (address != null && !address.isEmpty()) {
			this.address = address;
		}
		if (workingTime != null && !workingTime.isEmpty()) {
			this.workingTime = workingTime;
		}
	}
	
	public String getName() {
		return name;
	}

	public abstract int discount();
}
