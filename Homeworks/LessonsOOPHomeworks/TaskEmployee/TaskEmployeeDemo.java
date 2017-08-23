package lesson16HomeworkTaskEmployee;

public class TaskEmployeeDemo {

	public static void main(String[] args) {
		
		AllWork allTasks = new AllWork(10);
		
		Task t1 = new Task("Task 1", 15);
		Task t2 = new Task("Task 2", 4);
		Task t3 = new Task("Task 3", 6);
		Task t4 = new Task("Task 4", 1);
		Task t5 = new Task("Task 5", 32);
		Task t6 = new Task("Task 6", 40);
		Task t7 = new Task("Task 7", 18);
		Task t8 = new Task("Task 8", 2);
		Task t9 = new Task("Task 9", 3);
		Task t10 = new Task("Task 10", 2);
		
		allTasks.addTask(t1);
		allTasks.addTask(t2);
		allTasks.addTask(t3);
		allTasks.addTask(t4);
		allTasks.addTask(t5);
		allTasks.addTask(t6);
		allTasks.addTask(t7);
		allTasks.addTask(t8);
		allTasks.addTask(t9);
		allTasks.addTask(t10);
		
		System.out.println();
		
		Employee empl1 = new Employee("Raya", allTasks);
		Employee empl2 = new Employee("Nikol", allTasks);
		Employee empl3 = new Employee("Emo", allTasks);
		
		int dayOfWork = 1;
		
		while (!allTasks.isAllWorkDone()) {
			System.out.println("Start working day " + dayOfWork);
			System.out.println("------------------------------");
			
			empl1.startWorkingDay();
			empl2.startWorkingDay();
			empl3.startWorkingDay();
			
			System.out.println("------------------------------");
			
			dayOfWork++;
		}
	}
}
