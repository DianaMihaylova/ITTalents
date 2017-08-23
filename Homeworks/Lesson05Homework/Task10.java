package lesson05Homework;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[7];
		double sum = 0;
		
		System.out.println("Please enter seven numbers:");
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Enter array element[%d] = ", i);
			array[i] = sc.nextInt();
			sum += array[i];
		}
		
		double averageValue = sum / array.length;
		
		double[] newArray = new double[array.length];
		double minSub = 0;
		
		for (int i = 0; i < newArray.length; i++) {
			minSub = array[i] - averageValue;
			if (minSub < 0) {
				minSub = -(minSub);
			}
			newArray[i] = minSub;
		}
		
		double minNum = newArray[0];
		int minIndex = 0;
		
		for (int i = 0; i < newArray.length; i++) {
			if (minNum > newArray[i]) {
				minNum = newArray[i];
				minIndex = i;
			}
		}
		System.out.print("Average value is " + averageValue + ", " + "the nearest value is " + array[minIndex]);
		sc.close();
	}
}
