package lesson16HomeworkCarShop;

public class Person {
	
	private String name;
	private int age;
	boolean isMale;
	double money;
	Car car;
	
	
	public Person(String name, int age, boolean isMale, int money) {
		this.setName(name);
		this.setAge(age);
		this.isMale = isMale;
		this.money = money;
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
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("The age is not valid!");
			return;
		}	
	}
	
	void buyCar(Car car) {
		if (this.money >= car.price) {
			this.money -= car.price;
			car.owner = this;		
		} else {
			System.out.println("It has no money!");
		}
	}
	
	double sellCarForScrap() {
		double result = this.money + this.car.priceForScrap;
		this.money += result;
		this.car.owner = null;
		return result;
	}
}
