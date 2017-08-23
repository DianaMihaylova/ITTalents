package lesson06Homework;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("We have to make a matrix (row = col)!");
		System.out.println("Please enter a number for row length:");
		int row = sc.nextInt();
		System.out.println("Please enter a number for col length:");
		int col = sc.nextInt();
		
		while (row != col) {
			System.out.println("Wrong numbers!!! It must ---> row = col!");
			System.out.println("Please enter a number for row length:");
			row = sc.nextInt();
			System.out.println("Please enter a number for col length:");
			col = sc.nextInt();
		}
		
		int[][] array = new int[row][col];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.println("Please enter numbers for row: " + i + " column: " + j);
				array[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		int n = row;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (i == j) {
					System.out.print(array[i][j] + " ");
				}
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if ((i + j == n - 1)) {
					System.out.print(array[i][j] + " ");
				}
			}
		}
		sc.close();
	}
}
