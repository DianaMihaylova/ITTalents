package ticTacToe;

public class TTTDemo {

	public static void main(String[] args) {
		
		Player pl1 = new Player("Raya", 'X');
		Player pl2 = new Player("Nikol", 'O');
		
		Game ticTacToe = new Game(pl1, pl2);
		ticTacToe.play();
	}
}
