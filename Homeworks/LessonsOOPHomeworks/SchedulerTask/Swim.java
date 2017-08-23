package lesson21Homework;

public class Swim implements ITask {
	
	private String name;
	private final int numOfTask;
	private static int num = 1;
	
	public Swim() {
		this.numOfTask = num;
		num++;
		this.name = "Swim " + numOfTask;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void doWork() {
		System.out.println("Swimming in the pool......");
	}
}
