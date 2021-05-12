package starWar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
	
	private List<String> cardNumber = List.of("Ace","2","3","4","5","6","7",
			                              "8","9","10","Jack","Queen","King");
	//Suit
	private List<String> suits = List.of("Diamonds", "Hearts", "Clubs", "Spades");
	
	private List<Card> cards = new ArrayList<>();
	
	public Deck() {
		for (String suit : suits) {
			for(int i = 0; i < cardNumber.size(); i += 1) {
				Card card  = new Card(cardNumber.get(i), suit, i + 1);
				//System.out.println(card);
				cards.add(card);
			}
		}	
	}
	
	// Shuffle method
	public void shuffle() {
		Collections.shuffle(cards);	
	}
	// Draw card method
	public Card draw() {
		if(cards.isEmpty()) {
			throw new IllegalStateException("Deck is empty -cannot draw!");
		}
		return cards.remove(0);	
	}
	//Check deck size is empty
	public int size() {
		return cards.size();
	}
	
	@Override
	public String toString() {
		// Print out
		StringBuilder builder = new StringBuilder();
		builder.append("Deck:\n");
		for(Card card : cards) {
			builder.append(" ").append(card).append("\n");
		}
		return builder.toString();
	}
    // List of Card
	public List<Card> getCards() {
		return cards;
	}
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

    //Empty method
	public boolean isEmpty() {
		return size() == 0;
	}
}
