package homework03Recursion;

public class Task12 {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 999;
		
		printNum(a, b);
	}
	
	static void printNum(int i, int j) {
		if (i == j + 1) {
			return;
		}
		int a = (i / 100) % 10;
		int b = (i / 10) % 10;
		int c = i % 10;
		if (a != b && a != c && b != c) {
			System.out.println(i);
		}
		printNum(i + 1, j);
	}
}
