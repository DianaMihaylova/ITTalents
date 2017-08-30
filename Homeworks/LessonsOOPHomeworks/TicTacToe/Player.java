package ticTacToe;

public class Player {
	
	private String name;
	private char sign;
	private int score;
	private static boolean validPosition;
	
	public Player(String name, char sign) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
		if (charValidate(sign)) {
			this.sign = sign;
		}
		this.setScore(0);
	}

	public String getName() {
		return name;
	}
	
	public char getSign() {
		return sign;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		if (score >= 0) {
			this.score = score;	
		}
	}

	public static boolean isValidPosition() {
		return validPosition;
	}

	public boolean charValidate(char sign) {
		if (sign == 'X' || sign == 'O') {
			return true;
		}
		return false;
	}
	
	public void putOnBoard(char[][] ch, int a, int b, char sign) {
		if (ch[a][b] != ' ') {
			System.out.println("Coordinates are already in use. Please try again!");
			Player.validPosition = false;
			return;
		}
		ch[a][b] = sign;
		for (int i = 0; i < ch.length; i++) {
			System.out.println("------");
			for (int j = 0; j < ch[i].length; j++) {
				System.out.print(ch[i][j] + "|");
			}
			System.out.println();
		}
		System.out.println("------");
		Player.validPosition = true;
	}
}
