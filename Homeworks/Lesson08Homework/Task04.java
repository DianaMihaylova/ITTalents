package lesson08Homework;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String names;
		
		do {
			System.out.println("Plese enter full names of two persons:");
			names = sc.nextLine();
		} while (!names.contains(","));
				
		int index1 = names.indexOf(",");
		int index2 = names.indexOf(" ", index1);
		int sumName1 = 0;
		int sumName2 = 0;
		
		String name1 = names.substring(0, index1);
		String name2 = names.substring(index2 + 1, names.length());
		
		for (int i = 0; i < name1.length(); i++) {
			sumName1 += name1.charAt(i);
		}
		
		for (int i = 0; i < name2.length(); i++) {
			sumName2 += name2.charAt(i);
		}
		
		if (sumName1 > sumName2) {
			System.out.println(name1);
		} else {
			System.out.println(name2);
		}
		sc.close();
	}
}
