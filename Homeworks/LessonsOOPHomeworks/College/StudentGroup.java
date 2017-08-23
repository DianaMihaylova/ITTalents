package lesson16HomeworkCollege;

public class StudentGroup {
	
	String groupSubject;
	Student[] students;
	int freePlaces;
	
	StudentGroup() {
		students = new Student[5];
		freePlaces = 5;
	}
	
	StudentGroup(String subject) {
		this();
		groupSubject = subject;
	}
	
	void addStudent(Student s) {
		if (s.subject.equals(groupSubject) && freePlaces > 0) {
			for (int i = 0; i < students.length; i++) {
				if (students[i] == null) {
					students[i] = s;
					freePlaces--;
					System.out.println(students[i].name + " is added to the group " + groupSubject + " on place " +
									   i + " and it has " + freePlaces + " free places in the group.");
					break;
				}
			}		
		} else {
			System.out.println("There is no more free places or the subject is not the same!");
			return;
		}
	}
	
	void emptyGroup() {
		students = new Student[5];
		freePlaces = 5;
	}
	
	String theBestStudent() {
		String theBestStudentName = students[0].name;
		double theBestGrade = students[0].grade;
		for (int i = 1; i < students.length; i++) {
			if (students[i] != null) {
				if (theBestGrade < students[i].grade) {
					theBestGrade = students[i].grade;
					theBestStudentName = students[i].name;
				}
			} else {
				break;
			}
		}
		System.out.println("The best student in the group " + groupSubject + " is " + theBestStudentName);
		return theBestStudentName;
	}
	
	void printStudentsGroup() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				System.out.println("Name: " + students[i].name);
				System.out.println("Age: " + students[i].age);
				System.out.println("Grade: " + students[i].grade);
				System.out.println("Subject: " + students[i].subject);
				System.out.println("Year in college: " + students[i].yearInCollege);
				System.out.println("Is it degree: " + students[i].isDegree);
				System.out.println("Money: " + students[i].money);
				System.out.println();
			} else {
				break;
			}	
		}	
	}
}
