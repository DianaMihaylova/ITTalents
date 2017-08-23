package lesson18Homework;

public class ESPDemo {

	public static void main(String[] args) {
		
		Person[] persons = new Person[10];
		
		Person nikol = new Person("Nikol", 26, false);
		Person boris = new Person("Boris", 30, true);
		
		Student emo = new Student("Emo", 29, true, 4.50);
		Student raya = new Student("Raya", 23, false, 5.50);
		
		Employee monika = new Employee("Monika", 31, false, 100);
		Employee alex = new Employee("Alex", 29, true, 300);
		
		persons[0] = nikol;
		persons[1] = boris;
		persons[2] = emo;
		persons[3] = raya;
		persons[4] = monika;
		persons[5] = alex;
		
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] == null) {
				continue;
			}
			if (persons[i] instanceof Student) {
				((Student)(persons[i])).showStudentInfo();
				System.out.println();
			} else if (persons[i] instanceof Employee) {
				((Employee)(persons[i])).showEmployeeInfo();
				System.out.println();
			} else {
				persons[i].showPersonInfo();
				System.out.println();
			}
		}
		
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] == null) {
				continue;
			}
			if (persons[i] instanceof Employee) {
				double result = ((Employee)(persons[i])).calculateOvertime(2);
				System.out.println("Employee's money for overtime: " + result);
			}
		}
//		 Не е възможно да се дефинира конструктор без параметри Student() в класа Student. 
//		 Трябва да има такъв в базовия клас (родителския клас) Person, за да може да се 
//		 дефинира и в този клас.
	}
}
