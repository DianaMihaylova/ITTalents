package lesson01Homework;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an hour: ");
		byte time = Byte.parseByte(sc.nextLine());
		System.out.print("Enter sum of money: ");
		double money = Double.parseDouble(sc.nextLine());
		System.out.print("Arw you healthy? true or false:");
		boolean healthy = Boolean.parseBoolean(sc.nextLine());
		
		if (healthy == false) {
			System.out.println("I will not go out.");
			if (money > 0) {
				System.out.println("I will buy pills.");
			} else {
				System.out.println("I will stay home and drink tea.");
			}
		} else if (healthy == true) {
			if ((money >= 10) && (time < 23 && time > 8)) {
				System.out.println("I will go to the cinema with friends.");
			} else {
				System.out.println("I'll go to the coffee.");
			}
		}
		sc.close();
	}
}
