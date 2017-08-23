package lesson05Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[] array = new int[7];

		System.out.println("Please enter seven numbers:");

		for (int i = 0; i < array.length; i++) {
			System.out.printf("Enter array element[%d] = ", i);
			array[i] = sc.nextInt();
		}
		
		int c = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				c = array[i];
				array[i] = array[i + 1];
				array[i + 1] = c;
			} else if (i == 2) {
				array[i] = array[i] + array[i + 1];
				array[i + 1] = array[i] - array[i + 1];
				array[i] = array[i] - array[i + 1];
			} else if (i == 4) {
				array[i] = array[i] * array[i + 1];
				array[i + 1] = array[i] / array[i + 1];
				array[i] = array[i] / array[i + 1];
			}
		}
		System.out.println(Arrays.toString(array));
		sc.close();
	}
}
