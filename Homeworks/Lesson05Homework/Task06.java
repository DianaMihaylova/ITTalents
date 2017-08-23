package lesson05Homework;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter size of the first array:");
		int firstSzie = sc.nextInt();
		System.out.println("Please enter size of the second array:");
		int secondSzie = sc.nextInt();
		
		while (firstSzie <= 0 || secondSzie <= 0) {
			System.out.println("Wrong sizes! Enter a positive numbers for size!");
			System.out.println("Please enter size of the first array:");
			firstSzie = sc.nextInt();
			System.out.println("Please enter size of the second array:");
			secondSzie = sc.nextInt();
		}
		
		int[] firstArray = new int[firstSzie];
		int[] secondArray = new int[secondSzie];
		
		System.out.printf("Please enter values (%d numbers) of the first array:", firstSzie);
		System.out.println();
		
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = sc.nextInt();
		}
		
		System.out.printf("Please enter values (%d numbers) of the second array:", secondSzie);
		System.out.println();
		
		for (int i = 0; i < secondArray.length; i++) {
			secondArray[i] = sc.nextInt();
		}
		
		boolean equalsArrays = false;
		
		if (firstArray.length == secondArray.length) {
			equalsArrays = true;
		}
		System.out.println("The array's length are equals: " + equalsArrays);
		
		if (equalsArrays) {
			for (int i = 0; i < secondArray.length; i++) {
				if (firstArray[i] != secondArray[i]) {
					equalsArrays = false;
					break;
				}
			}
		} 
		System.out.println("The arrays are equals: " + equalsArrays);
		sc.close();
	}
}
