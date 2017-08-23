package lesson07AdditionalArraysTasks;

public class Task06 {

	public static void main(String[] args) {
		
		char[][] array = {
				{'a','b','c'},
				{'f','g','k'},
				{'r','t','s'},
		};
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i][i] + " ");
		}
	}
}
