package lesson05Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter array size:");
		int size = Integer.parseInt(sc.nextLine());
		
		while (size <= 0) {
			System.out.println("Wrong size! Eneter a positive number:");
			size = Integer.parseInt(sc.nextLine());
		}
		
		double[] array = new double[size];

		for (int i = 0; i < array.length; i++) {
			System.out.printf("Enter array element[%d] = ", i);
			array[i] = Double.parseDouble(sc.nextLine());
		}
		
		int length = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= -2.99 && array[i] <= 2.99) {
				length++;
			}
		}
		
		double[] newArray = new double[length];
		int num = 0;
		int numTwo = 0;
		
		while (num <= array.length - 1) {
			if (array[num] >= -2.99 && array[num] <= 2.99) {
				if (numTwo <= newArray.length - 1) {
					newArray[numTwo] = array[num];
					numTwo++;
				}
			}
			num++;
		}
		System.out.println(Arrays.toString(newArray));
		sc.close();
	}
}
