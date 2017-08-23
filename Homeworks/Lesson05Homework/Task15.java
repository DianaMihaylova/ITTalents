package lesson05Homework;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter array size:");
		int size = Integer.parseInt(sc.nextLine());
		
		while (size <= 0) {
			System.out.println("Wrong size! Enter a positive number:");
			size = Integer.parseInt(sc.nextLine());
		}
		
		double[] array = new double[size];
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Enter array element[%d] = ", i);
			array[i] = Double.parseDouble(sc.nextLine());
		}
		
		double[] newArray = new double[array.length];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				newArray[i] = -(array[i]);
			} else {
				newArray[i] = array[i];
			}
		}
		
		double maxOneNum = newArray[0];
		int indexOne = 0;
		double maxTwoNum = 0;
		int indexTwo = 0;
		double maxThreeNum = 0;
		int indexThree = 0;
		
		for (int i = 0; i < newArray.length; i++) {
			if (maxOneNum < newArray[i]) {
				maxOneNum = newArray[i];
				indexOne = i;
			}
		}
		
		for (int i = 0; i < newArray.length; i++) {
			if (maxTwoNum < newArray[i] && 
				newArray[i] != maxOneNum && 
				newArray[i] < maxOneNum) {
				maxTwoNum = newArray[i];
				indexTwo = i;
			}
		}
		
		for (int i = 0; i < newArray.length; i++) {
			if (maxThreeNum < newArray[i] && 
				newArray[i] != maxOneNum && 
				newArray[i] != maxTwoNum && 
				newArray[i] < maxTwoNum) {
				maxThreeNum = newArray[i];
				indexThree = i;
			}
		}
		System.out.print(array[indexThree] + "; " + array[indexTwo] + "; " + array[indexOne]);
		sc.close();
	} 
}
