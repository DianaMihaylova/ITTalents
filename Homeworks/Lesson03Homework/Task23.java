package lesson03Homework;

public class Task23 {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		
		while (x < 10) {
			while (x > y) {
				y++;
			}
			System.out.print(x + "*" + y + "; ");
			y++;
			if (y == 10) {
				x++;
				y = 1;
				System.out.println();
			}
		}
	}
}
