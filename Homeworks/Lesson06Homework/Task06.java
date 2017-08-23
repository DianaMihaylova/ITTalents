package lesson06Homework;

public class Task06 {

	public static void main(String[] args) {
		
		int[][] array = {
				{11,12,13,14,15,16},
				{21,22,23,24,25,26},
				{31,32,33,34,35,36},
				{41,42,43,44,45,46},
				{51,52,53,54,55,56},
				{61,62,63,64,65,66}
		};
		
		int sumOfRow = 0;
		int sumOfAll = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (i % 2 != 0 && i != 0) {
					sumOfRow += array[i][j];
					System.out.print(array[i][j] + " ");
				}
			} 
			if (i % 2 != 0 && i != 0) {
				System.out.print("sum: " + sumOfRow);
			} else {
				continue;
			}
			sumOfAll += sumOfRow;
			sumOfRow = 0;
			System.out.println();
		}
		System.out.println("Sum of all element: " + sumOfAll);
	}
}
