package ticTacToe;

import java.util.Scanner;

public class Game {
	
	private static Scanner sc = new Scanner(System.in);
	private char[][] board;
	private boolean isGameOver;
	private Player currentPlayer;
	private Player pl1;
	private Player pl2;
	
	public Game(Player pl1, Player pl2) {
		if (pl1 != null && pl2 != null) {
			this.pl1 = pl1;
			this.pl2 = pl2;
		}
		board = new char[3][3];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = ' ';
			}
		}
		this.currentPlayer = pl1;
		this.isGameOver = false;
	}
	
	public void play() {
		if (isGameOver) {
			return;
		}
		String x;
		String y;
		System.out.println(this.currentPlayer.getName() + "'s turn");
		do {
			System.out.print("Enter X position: ");
			x = sc.nextLine();
			System.out.print("Enter Y position: ");
			y = sc.nextLine();
		} while (!x.matches("[0-2]") || !y.matches("[0-2]"));
		this.currentPlayer.putOnBoard(this.board, Integer.parseInt(x), Integer.parseInt(y),this.currentPlayer.getSign());
		checkForWinner();
	}
	
	private void checkForWinner() {
		if (checkWin(this.currentPlayer.getSign())) {
			this.isGameOver = true;
			if (this.currentPlayer == pl1) {
				pl1.setScore(pl1.getScore() + 1);
				System.out.println("Game over! \n" + pl1.getName() + " wins!");
				System.out.println(pl1.getName() + "'s SCORE: " + pl1.getScore());
				this.currentPlayer = null;
			} else {
				pl2.setScore(pl2.getScore() + 1);
				System.out.println("Game over! \n" + pl2.getName() + " wins!");
				System.out.println(pl2.getName() + "'s SCORE: " + pl2.getScore());
				this.currentPlayer = null;
			}
		} else if (isFullBoard()) {
			System.out.println("Game over! Nobody's win!");
			this.currentPlayer = null;
			this.isGameOver = true;
		} else {
			changePlayer();
			play();
		}
	}
	
	private void changePlayer() {
		if (Player.isValidPosition()) {
			if (this.currentPlayer == pl1) {
				this.currentPlayer = pl2;
			} else {
				this.currentPlayer = pl1;
			}
		} else {
			if (this.currentPlayer == pl1) {
				this.currentPlayer = pl1;
			} else {
				this.currentPlayer = pl2;
			}
		}
	}
	
	private boolean isFullBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}
	
	private boolean checkWin(char symbol) {
		// check rows:
		for (int i = 0; i < board.length; i++) {
			if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
				return true;
			}
		}
		// check cols:
		for (int j = 0; j < board.length; j++) {
			if (board[0][j] == symbol && board[1][j] == symbol && board[2][j] == symbol) {
				return true;
			}
		}
		// check diagonals:
		if ((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) || 
			(board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
			return true;
		}
		return false;
	}
}
