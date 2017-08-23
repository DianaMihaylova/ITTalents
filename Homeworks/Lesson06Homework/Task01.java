package lesson06Homework;

public class Task01 {

	public static void main(String[] args) {
		
		int[][] array = {
				{48,72,13,14,15},
				{21,22,53,24,75},
				{31,57,33,34,35},
				{41,95,43,44,45},
				{59,52,53,54,55},
				{61,69,63,64,65}
		};
		
		int minElement = array[0][0];
		int maxElement = array[0][0];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (minElement > array[i][j]) {
					minElement = array[i][j];
				}
				if (maxElement < array[i][j]) {
					maxElement = array[i][j];
				}
			}
		}
		System.out.println("The smalest element is " + minElement + ";");
		System.out.println("The biggest element is " + maxElement);
	}
}
