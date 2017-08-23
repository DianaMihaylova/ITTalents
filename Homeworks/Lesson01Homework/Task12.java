package lesson01Homework;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter day: ");
		byte day = sc.nextByte();
		System.out.print("Enter month: ");
		byte month = sc.nextByte();
		System.out.print("Enter year: ");
		short year = sc.nextShort();
		
		byte lastDay;
		
		if (month == 2) {
			if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
				lastDay = 29;
			} else {
				lastDay = 28;
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			lastDay = 30;
		} else {
			lastDay = 31;
		}
		if (day < lastDay) {
			day++;
		} else {
			day = 1;
			if (month < 12) {
				month++;
			} else {
				month = 1;
				year++;
			}
		}
		System.out.printf("The next date is: %s.%s.%s", day, month, year);
		sc.close();
	}
}
