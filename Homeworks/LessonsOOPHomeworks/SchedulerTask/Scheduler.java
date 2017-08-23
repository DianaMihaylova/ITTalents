package lesson21Homework;

import java.util.LinkedList;
import java.util.Queue;

public class Scheduler {
	
	private Queue<ITask> que;
	
	public Scheduler() {
		this.que = new LinkedList<>();
	}
	
	public void push(ITask t) {
		if (t != null) {
			this.que.offer(t);
			System.out.println("The task " + "\"" + t.getName() + "\"" + " is added to tasks!");
		}
	}
	
	public void doAllTasks() {
		if (this.que.size() > 0) {
			System.out.println("--------------------------------");
			while (!this.que.isEmpty()) {
				ITask t = this.que.remove();
				t.doWork();
				System.out.println("The task " + "\"" + t.getName() + "\"" + " is done and removed from tasks!");
				System.out.println("--------------------------------");
			}
		} else {
			System.out.println("It has no task!");
		}
	}
}
