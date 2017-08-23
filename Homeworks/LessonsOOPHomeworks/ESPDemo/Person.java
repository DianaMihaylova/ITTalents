package lesson18Homework;

public class Person {
	
	private String name;
	private int age;
	private boolean isMale;
	
	public Person(String name, int age, boolean isMale) {
		this.setName(name);
		this.setAge(age);
		this.setMale(isMale);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (name != null && name != "") {
			this.name = name;
		} else {
			System.out.println("Enter a valid name!");
			return;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age > 0 && age < 120) {
			this.age = age;
		} else {
			System.out.println("Enter a valid age!");
			return;
		}
	}
	
	public boolean isMale() {
		return isMale;
	}
	
	public void setMale(Boolean isMale) {
		this.isMale = isMale;
	}
	
	public void showPersonInfo() {
		System.out.println("Name of person: " + this.name);
		System.out.println("Age of person: " + this.age);
		System.out.println("The person is male: " + this.isMale);
	}
}
