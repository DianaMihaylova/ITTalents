package lesson03Homework;

public class Task12 {

	public static void main(String[] args) {
		
		for (int i = 100; i <= 999; i++) {
			int a = (i / 100) % 10;
			int b = (i / 10) % 10;
			int c = i % 10;
			if (a == b || a == c || b == c) {
				continue;
			} else {
				System.out.println(i);
			}
		}
	}
}
