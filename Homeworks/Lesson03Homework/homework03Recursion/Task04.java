package homework03Recursion;

public class Task04 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 1;
		
		printNum(a, b);
	}
	
	static void printNum(int i, int j) {
		if (i == j - 1) {
			return;
		}
		System.out.print(i + " ");
		printNum(i - 1, j);
	}
}
