package lesson18Homework;

public class Employee extends Person {
	
	private double daySalary;

	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		this.setDaySalary(daySalary);
	}

	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		if (daySalary > 0) {
			this.daySalary = daySalary;
		} else {
			System.out.println("Enter valid num!");
			return;
		}
	}
	
	public double calculateOvertime(double hours) {
		double overtimeSum = 0;
		if (this.getAge() < 18) {
			overtimeSum = 0;
		} else {
			overtimeSum = (this.daySalary / 8) * 1.5 * hours;
		}
		return overtimeSum;
	}
	
	public void showEmployeeInfo() {
		super.showPersonInfo();
		System.out.println("Employee day salary is: " + this.daySalary);
	}
}
