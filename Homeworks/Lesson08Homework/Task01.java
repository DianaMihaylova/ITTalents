package lesson08Homework;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String firstString;
		String secondString;
		
		do {
			System.out.println("Please enter à first character string <= 40 symbols:");
			firstString = sc.nextLine();
			System.out.println("Please enter à second character string <= 40 symbols:");
			secondString = sc.nextLine();
		} while (firstString.length() > 40 || secondString.length() > 40);
		
		System.out.println(firstString.toUpperCase() + " " +
						   firstString.toLowerCase() + " " + 
						   secondString.toUpperCase()+ " " + 
						   secondString.toLowerCase());
		sc.close();
	}
}
