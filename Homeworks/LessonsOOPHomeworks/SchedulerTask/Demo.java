package lesson21Homework;

public class Demo {

	public static void main(String[] args) {
		
		Scheduler scheduler = new Scheduler();
		
		MakePizza pizza = new MakePizza();
		Drive drive = new Drive();
		Dance dance = new Dance();
		Swim swim = new Swim();
		MakePizza pizza1 = new MakePizza();
		Dance dance1 = new Dance();
		
		scheduler.push(pizza);
		scheduler.push(drive);
		scheduler.push(swim);
		scheduler.push(dance);
		scheduler.push(pizza1);
		scheduler.push(dance1);
		
		scheduler.doAllTasks();
		scheduler.doAllTasks();
	}
}
