package homework03Recursion;

import java.util.Scanner;

public class Task28 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int i = 1;
		int j = 1;
		
		print(a,b,i,j);
		
		sc.close();
	}
	
	static void print(int a, int b, int i, int j) {
		if (i == b + 1) {
			return;
		}
		printInside(i,j);
		System.out.println();
		print(a,b,i+1,j);
	}
	
	static void printInside(int i,int j) {
		if (j == i + 1) {
			return;
		}
		System.out.print(j + " ");
		printInside(i,j+1);
	}
}
