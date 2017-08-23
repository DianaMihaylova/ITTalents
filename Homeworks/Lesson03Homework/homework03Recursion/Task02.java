package homework03Recursion;

public class Task02 {

	public static void main(String[] args) {
		
		int a = -20;
		int b = 50;
		
		printNum(a, b);
	}
	
	static void printNum(int i, int j) {
		if (i == j + 1) {
			return;
		}
		System.out.println(i);
		printNum(i + 1, j);
	}
}
