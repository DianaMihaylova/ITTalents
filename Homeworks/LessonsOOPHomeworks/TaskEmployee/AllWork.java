package lesson16HomeworkTaskEmployee;

public class AllWork {
	
	private Task[] tasks;
	int freePlacesForTasks;
	int currentUnassignedTask;
	
	public AllWork(int taskSize) {
		tasks = new Task[taskSize];
		freePlacesForTasks = taskSize;
		currentUnassignedTask = 0;
	}
	
	public void addTask(Task newTask) {
		if (freePlacesForTasks == 0) {
			System.out.println("There are no free places.");
			return;
		}
		if (newTask.isValidHours()) {
			int tasksIndex = tasks.length - freePlacesForTasks;
			tasks[tasksIndex] = newTask;
			freePlacesForTasks--;
			System.out.println(newTask.getName() + " has been added to the tasks!");
		}
	}
	
	public Task getNextTask() {
		if (currentUnassignedTask >= tasks.length - freePlacesForTasks) {
			System.out.println("There are no more available tasks! All work is done!");
			System.out.println();
			return null;
		}
		Task getTask = tasks[currentUnassignedTask];
		currentUnassignedTask++;
		return getTask;
	}
	
	public boolean isAllWorkDone() {
		boolean isDone = true;
		for (int i = 0; i < tasks.length; i++) {
			if (tasks[i] != null) {
				if (tasks[i].getWorkingHours() != 0) {
					isDone = false;
					break;
				} else {
					isDone = true;
				}
			} else {
				System.out.println("No more work!");
				break;
			}
		}
		return isDone;
	}
}
