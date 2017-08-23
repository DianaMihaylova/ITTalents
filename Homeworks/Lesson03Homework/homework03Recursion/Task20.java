package homework03Recursion;

public class Task20 {

	public static void main(String[] args) {
		
		int a = 10;
		int i = 1;
		int j = i;
		
		print(a,i,j);
	}
	
	static void print(int a,int i,int j) {
		if (i == a+1) {
			return;
		}
		printInside(a,i,i);
		System.out.println();
		print(a,i+1,j);
	}
	
	static void printInside(int a, int i, int j) {
		if (j == a+i+1) {
			return;
		}
		if (j < 10) {
			System.out.print(j + " ");
		}
		if (j > 9) {
			int print;
			print = j % 10;
			System.out.print(print + " ");
		}
		printInside(a,i,j+1);
	}
}
