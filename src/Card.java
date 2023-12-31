public class Card {
	Suit suit;
	int rank;
	int deck;
	String symbol;
	boolean fold;

	public Card(Suit suit, int rank, int deck) {
		this.suit = suit;
		this.rank = rank;
		this.deck = deck;
	}

	public String cardName() {
		return suit+"_"+rank+".png";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Card) {
			Card s = (Card)o;
			if (suit.equals(s.suit) && rank == s.rank)
				return true;
		}
		return false;
	}
}
