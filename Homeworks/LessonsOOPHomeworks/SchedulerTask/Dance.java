package lesson21Homework;

public class Dance implements ITask {
	
	private String name;
	private final int numOfTask;
	private static int num = 1;
	
	public Dance() {
		this.numOfTask = num;
		num++;
		this.name = "Dance " + numOfTask;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void doWork() {
		System.out.println("Dancing on the dance floor.....");
	}
}
