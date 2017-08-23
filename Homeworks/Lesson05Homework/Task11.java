package lesson05Homework;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[7];
		
		System.out.println("Please enter seven numbers:");
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Enter array element[%d] = ", i);
			array[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 5 && array[i] % 5 == 0) {
				System.out.print(array[i] + "; ");
				sum++;
			}
		}
		System.out.print("- " + sum + " numbers");
		sc.close();
	}
}
