package lesson06Homework;

public class Task07 {

	public static void main(String[] args) {
		
		int[][] array = {
				{11,12,13,14,15,16},
				{21,22,23,24,25,26},
				{31,32,33,34,35,36},
				{41,42,43,44,45,46},
				{51,52,53,54,55,56},
				{61,62,63,64,65,66}
		};
		
		int sum = 0;
		int sumOfAll = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if ((i + j) % 2 == 0) {
					sum += array[i][j];
					System.out.print(array[i][j] + " ");
				}
				if (j == array[0].length - 1) {
					System.out.print("sum of the elements of row: " + sum);
				}
			}
			sumOfAll += sum;
			sum = 0;
			System.out.println();
		}
		System.out.println("Sum of all elements: " + sumOfAll);
	}
}
