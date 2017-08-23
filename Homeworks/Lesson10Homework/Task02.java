package lesson10Homework;

public class Task02 {

	public static void main(String[] args) {
		
		int[] array = {1,7,3,3,9,11,9,9,14,12,9,11};
		
		countingSort(array);
	}
	
	static void countingSort(int[] arr) {
		int minElement = arr[0];
		int maxElement = arr[arr.length - 1];
		
		for (int i = 0; i < arr.length; i++) {
			if (minElement > arr[i]) {
				minElement = arr[i];
			}
			if (maxElement < arr[i]) {
				maxElement = arr[i];
			}
		}
		
		int[] helper = new int[maxElement + 1];
		
		int maxCount = 0;
		int sum = 0;
		
		for (int i = 0; i < helper.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i) {
					count++;
				}
				if (maxCount < count) {
					maxCount = count;
				}
			}
			helper[i] = count;
			if (count > 1) {
				sum++;
			}
		}
		
		for (int i = 0; i < helper.length; i++) {
            for (int j = 0; j < helper[i]; j++) {
                System.out.print(i + " ");
            }
        }
		
        System.out.println();
        System.out.println("The longest area is: " + maxCount + " elements");
        System.out.println("Sum of areas: " + sum);
	}
}
