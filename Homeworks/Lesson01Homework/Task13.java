package lesson01Homework;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a temperature of the interval [-100..100]:");
		byte temperature = sc.nextByte(); 
		
		if (temperature < - 20) {
			System.out.println("Ice cold");
		} else if (temperature <= 0 && temperature >= - 20) {
			System.out.println("Cold");
		} else if (temperature <= 15 && temperature > 0) {
			System.out.println("Cool weather");
		} else if (temperature <= 25 && temperature > 15) {
			System.out.println("Warm");
		} else if (temperature > 25) {
			System.out.println("Hot");
		}
		sc.close();
	}
}
