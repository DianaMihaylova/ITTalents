package lesson21Homework;

public class Drive implements ITask {
	
	private String name;
	private final int numOfTask;
	private static int num = 1;
	
	public Drive() {
		this.numOfTask = num;
		num++;
		this.name = "Drive " + numOfTask;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void doWork() {
		System.out.println("Drive a bike...");
	}
}
