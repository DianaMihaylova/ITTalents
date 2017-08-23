package lesson16HomeworkComputer;

public class Computer {
	
	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;
	String model;
	
	Computer() {
		isNotebook = false;
		operationSystem = "Win XP";
	}
	
	Computer(int year, double price, int hardDiskMemory, int freeMemory, String model) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.model = model;
	}
	
	Computer(int year, double price, boolean isNotebook, int hardDiskMemory, int freeMemory, String operationSystem, String model) {
		this(year, price, hardDiskMemory, freeMemory, model);
		this.isNotebook = isNotebook;
		this.operationSystem = operationSystem;
	}
	
	void changeOperationSystem(String newOperationSystem) {
		if (newOperationSystem != null) {
			operationSystem = newOperationSystem;
		} else {
			System.out.println("The system is not valid!");
			return;
		}
	}
	
	void useMemory(int memory) {
		if (freeMemory > memory) {
			freeMemory -= memory;
		} else {
			System.out.println("Not enough free memory!");
			return;
		}
	}
	
	int comparePrice(Computer c) {
		if (this.price > c.price) {
			return -1;
		} else if (this.price < c.price) {
			return 1;
		} else {
			return 0;
		}
	}
	
	void print() {
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
		System.out.println("Price: " + price);
		System.out.println("Is this notebook: " + isNotebook);
		System.out.println("Hard Disk Memory: " + hardDiskMemory);
		System.out.println("Free memory: " + freeMemory);
		System.out.println("Operation system: " + operationSystem);
	}
}
