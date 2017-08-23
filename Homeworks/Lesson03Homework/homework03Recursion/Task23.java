package homework03Recursion;

public class Task23 {

	public static void main(String[] args) {
		
		int i = 1;
		int j = i;
		
		print(i,j);
		
	}
	static void print(int i,int j) {
		if (i == 10) {
			return;
		}
		printInside(i,j=i);
		System.out.println();
		print(i+1,j);
	}
	
	static void printInside(int i, int j) {
		if (j == 10) {
			return;
		}
		System.out.print(i + "*" + j + ";");
		printInside(i,j+1);
	}
}
