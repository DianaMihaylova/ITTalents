package lesson16HomeworkCollege;

public class Student {
	
	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	int money;
	
	Student() {
		grade = 4.0;
		yearInCollege = 1;
		isDegree = false;
		money = 0;
	}
	
	Student(String name, String subject, double grade, int yearInCollege, boolean isDegree, int money) {
		this();
		this.name = name;
		this.subject = subject;
	}
	
	Student(String name, String subject, double grade, int yearInCollege, int age, boolean isDegree, int money) {
		this(name, subject, grade, yearInCollege, isDegree, money);
		this.age = age;
		this.grade = grade;
		this.yearInCollege = yearInCollege;
		this.money = money;
	}
	
	void upYear() {
		if (!isDegree) {
			yearInCollege++;
			if (yearInCollege == 4) {
				isDegree = true;
			}
		} else {
			System.out.println("The student has graduated!");
			return;
		}
	}
	
	double receiveScholarship(double min, double amount) {
		if (grade >= min && age < 30) {
			money += amount;
		}
		return money;
	}
}
