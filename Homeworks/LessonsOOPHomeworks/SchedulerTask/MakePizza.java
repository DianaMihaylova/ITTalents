package lesson21Homework;

public class MakePizza implements ITask {
	
	private String name;
	private final int numOfTask;
	private static int num = 1;
	
	public MakePizza() {
		this.numOfTask = num;
		num++;
		this.name = "Make pizza " + numOfTask;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void doWork() {
		System.out.println("Making pizza...");
	}
}
