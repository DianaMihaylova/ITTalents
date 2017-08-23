package lesson10Homework;

public class Task03 {

	public static void main(String[] args) {
		
		int[] array = {1, 3, 5, 7, 9, 11, 10};
		
		sort(array);
	}
	
	static void sort(int[] arr) {
		boolean check = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				System.out.println(arr[i] + " > " + arr[i + 1]);
				check = false;
			}
		}
		if (check) {
			System.out.println("Elements of the array are sorted.");
		} else {
			System.out.println("Elements of the array are not sorted.");
		}
	}
}
