package lesson16HomeworkTaskEmployee;

public class Task {
	
	private String name;
	private double workingHours;
	private boolean isValidHours;
	
	public Task(String name, double workingHours) {
		this.setName(name);
		this.setWorkingHours(workingHours);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		} else {
			System.out.println("The name is not valid!");
			return;
		}
	}

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		if (workingHours >= 0) {
			this.workingHours = workingHours;
			this.setValidHours(true);
		} else {
			System.out.println("The hours of the task are not valid!");
			this.setValidHours(false);
			return;
		}
	}

	public boolean isValidHours() {
		return isValidHours;
	}

	public void setValidHours(boolean isValidHours) {
		this.isValidHours = isValidHours;
	}
}
