package lesson10Homework;

public class Task01 {

	public static void main(String[] args) {
		
		int[][] array = {
				{15, 16, 8, 1},
				{2, 3, 4, 7},
				{9, 11, 19, 6}	
		};
		
		bubbleSort(array);
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static void bubbleSort(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr.length; k++) {
					for (int k2 = 0; k2 < arr[i].length; k2++) {
						if (arr[k][k2] > arr[i][j]) {
							int temp = arr[i][j];
							arr[i][j] = arr[k][k2];
							arr[k][k2] = temp;
						}
					}
				}
			}
		}
	}
}
