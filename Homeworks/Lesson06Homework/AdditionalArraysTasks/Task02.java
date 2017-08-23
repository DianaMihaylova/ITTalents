package lesson07AdditionalArraysTasks;

public class Task02 {

	public static void main(String[] args) {
		
		int[] array = {5,1,3,2,5,7};
		
		boolean check = false;
		
		for (int i = 1; i < array.length - 1; i++) {
			if ((array[i] < array[i - 1]) && (array[i] < array[i + 1]) ||
				(array[i] > array[i - 1]) && (array[i] > array[i + 1])) {
				check = true;
			}
		}
		System.out.println("Array is zigzagged: " + check);
	}
}
