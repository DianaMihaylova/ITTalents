package homework03Recursion;

public class Task03 {

	public static void main(String[] args) {
		
		int a = -10;
		int b = 10;
		
		printNum(a, b);
	}
	
	static void printNum(int i, int j) {
		if (i == j + 1) {
			return;
		}
		if (i % 2 != 0) {
			System.out.println(i);
		}
		printNum(i + 1, j);
	}
}
