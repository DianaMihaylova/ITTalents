package homework03Recursion;

public class Task01 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 100;
		
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
