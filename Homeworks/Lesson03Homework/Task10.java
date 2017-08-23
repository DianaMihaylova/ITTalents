package lesson03Homework;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Plese enter a positive number > 1:");
		int num = sc.nextInt();
		
		while (num <= 1) {
			System.out.println("Wrong number!!! Plese enter a positive number > 1:");
			num = sc.nextInt();
		}
		
		boolean primeNum = true;
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				if ((i != 1) && (i != num)) {
					primeNum = false;
					break;
				}
			}
		}
		System.out.println("Is this prime number? - " + primeNum);
		sc.close();
	}
}
