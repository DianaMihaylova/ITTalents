package lesson16HomeworkWarGame;

public class Card {
	
	 private int rank;
	 private int suit;
	 
	 public Card(int rank, int suit) {
		 this.setRank(rank);
		 this.setSuit(suit);
	 }

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		if (rank > 1 && rank < 15) {
			this.rank = rank;
		} else {
			System.out.println("Enter valid rank!");
			return;
		}
	}

	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		if (suit >= 0 && suit < 4) {
			this.suit = suit;
		} else {
			System.out.println("Enter a valid suit!");
			return;
		}
	}

	@Override
	public String toString() {
		StringBuilder cardToString = new StringBuilder();
		switch (rank) {
		case 11:
			cardToString.append("Jack");
			break;
		case 12:
			cardToString.append("Queen");
			break;
		case 13:
			cardToString.append("King");
			break;
		case 14:
			cardToString.append("Ace");
			break;
		default:
			cardToString.append(rank);
			break;
		}
		
		cardToString.append(" of ");
		
		switch (suit) {
		case 0:
			cardToString.append("Spades");
			break;
		case 1:
			cardToString.append("Hearts");
			break;
		case 2:
			cardToString.append("Clubs");
			break;
		case 3:
			cardToString.append("Diamonds");
			break;
		default:
			System.out.println("It no such suit!");
			break;
		}
		return cardToString.toString();
	}
}
