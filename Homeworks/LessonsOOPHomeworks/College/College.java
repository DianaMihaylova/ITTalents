package lesson16HomeworkCollege;

public class College {

	public static void main(String[] args) {
		
		Student nikol = new Student("Nikol", "Informatika", 5.50, 3, 23, false, 300);
		Student boris = new Student("Boris", "Finance", 5, 2, 21, false, 100);
		Student emo = new Student("Emo", "Informatika", 4.50, 4, 26, false, 90);
		Student raya = new Student("Raya", "Informatika", 6, 1, 19, false, 100);
		Student alex = new Student("Alex", "Finance", 5.20, 3, false, 69999);
		
		nikol.receiveScholarship(5, 600);
		raya.receiveScholarship(5.5, 900);
		
		boris.upYear();
		raya.upYear();
		
		StudentGroup informatika = new StudentGroup("Informatika");
		StudentGroup finance = new StudentGroup("Finance");
		
		informatika.addStudent(nikol);
		informatika.addStudent(emo);
		informatika.addStudent(raya);
		
		finance.addStudent(boris);
		finance.addStudent(alex);
		
		System.out.println();
		informatika.theBestStudent();
		
		System.out.println();
		
		informatika.printStudentsGroup();
		
		finance.printStudentsGroup();
	}
}
