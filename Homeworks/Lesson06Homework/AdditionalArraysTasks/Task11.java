package lesson07AdditionalArraysTasks;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n:");
		int n = sc.nextInt();
		System.out.println("Enter m:");
		int m = sc.nextInt();
		
		matrix(n, m);
		
		sc.close();
	}
	
	static void matrix(int n, int m) {
		int[][] matrix = new int[n][m];
		int num = 1;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print((matrix[i][j] = num) + " ");
				num++;
			}
			System.out.println();
		}
		return;
	}
}
