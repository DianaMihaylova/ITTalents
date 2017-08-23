package homework03Recursion;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int value = size - 1;
		int row = size;

		print(size, value, row);
		sc.close();
	}

	static void print(int size, int value, int row) {
		if (size == 0) {
			return;
		}
		printInside(value, row);
		value += 2;
		System.out.println();
		print(size - 1, value, row);
	}

	static void printInside(int value, int row) {
		if (row == 0) {
			return;
		}
		System.out.print(value);
		printInside(value, row - 1);
	}
}
