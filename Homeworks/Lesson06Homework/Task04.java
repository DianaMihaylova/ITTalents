package lesson06Homework;

public class Task04 {

	public static void main(String[] args) {
		
		int[][] array = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[array.length - 1 - j][i] + " ");
			}
			System.out.println();
		}
	}
}
