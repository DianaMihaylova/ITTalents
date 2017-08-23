package lesson16HomeworkTaskEmployee;

public class Employee {
	
	private String name;
	private Task currentTask;
	private double hoursLeft;
	private AllWork allWork;
	
	public Employee(String name, AllWork allWork) {
		this.setName(name);
		this.setAllwork(allWork);
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
	
	public Task getCurrentTask() {
		return currentTask;
	}
	
	public void setCurrentTask(Task currentTask) {
		if (currentTask != null) {
			this.currentTask = currentTask;
		} else {
			System.out.println("The task is not valid!");
			return;
		}
	}
	
	public double getHoursLeft() {
		return hoursLeft;
	}
	
	public void setHoursLeft(double hoursLeft) {
		if (hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		} else {
			System.out.println("The hours are not valid!");
			return;
		}
	}
	
	public AllWork getAllWork() {
		return allWork;
	}

	public void setAllwork(AllWork allWork) {
		if (allWork != null) {
			this.allWork = allWork;
		} else {
			System.out.println("The work is not valid!");
		}	
	}

	public void work() {
		do {
			if (this.currentTask != null && currentTask.getWorkingHours() != 0) {
				if (this.hoursLeft < currentTask.getWorkingHours()) {
					currentTask.setWorkingHours(currentTask.getWorkingHours() - this.hoursLeft);
					setHoursLeft(0);
				} else {
					this.setHoursLeft(this.hoursLeft - currentTask.getWorkingHours());
					currentTask.setWorkingHours(0);
				}
				showReport();
			} else {
				if (this.currentTask == null || currentTask.getWorkingHours() == 0) {
					this.currentTask = allWork.getNextTask();
					if (this.currentTask == null) {
						break;
					}
				} else {
					break;
				}
				System.out.println("Assigning task " + currentTask.getName() + " to " + this.name);
			}
			System.out.println();
		} while (this.hoursLeft > 0 || allWork.isAllWorkDone());
	}
	
	public void startWorkingDay() {
		this.hoursLeft = 8;
		work();
	}
	
	public void showReport() {
		System.out.println("Name of the employee: " + this.name);
		System.out.println("Name of the task: " + this.currentTask.getName());
		System.out.println("Hours left of the employee: " + this.hoursLeft);
		System.out.println("Working hours left of the task: " + this.currentTask.getWorkingHours());
	}
}
