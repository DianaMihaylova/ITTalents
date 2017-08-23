package lesson01Homework;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer number between 10 and 9999:");
		short litersOfWater = sc.nextShort();
		
		byte numFill = (byte) (litersOfWater / 5);
		short litersFill = (short) ((numFill * 2) + (numFill * 3));
		byte moreLiters = (byte) (litersOfWater - litersFill);
		
		if (litersOfWater % 5 == 0) {
			System.out.printf("%s times of 2 liters, \n" +
					          "%s times of 3 liters", 
					          numFill, numFill);
		} else if ((litersOfWater % 5 != 0) && (moreLiters % 2 == 0)) {
			System.out.printf("%s times of 2 liters, \n" +
		                      "%s times of 3 liters, \n" +
					          "more %s times of 2 liters",
					          numFill, numFill, moreLiters / 2);
		} else if ((litersOfWater % 5 != 0) && (moreLiters % 2 != 0)) {
			--numFill;
			litersFill = (short) ((numFill * 2) + (numFill * 3));
			moreLiters = (byte) (litersOfWater - litersFill);
			System.out.printf("%s times of 2 liters, \n" +
					          "%s times of 3 liters, \n" +
					          "more %s times of 3 liters",
					          numFill, numFill, moreLiters / 3);
		}
		sc.close();
	}
}
