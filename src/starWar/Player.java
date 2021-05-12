package starWar;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card>hand = new ArrayList<>();
	private int points;
	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	//Get point method
	public int getPoints() {
		return points;
	}
	//Get point method
	public String getName() {
		return name;
	}
	public int size() {
		return hand.size();	
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Player ").append(name).append(" with ").append(points)
		.append(" points...\n").append("Hand: \n");
		
		for(Card card : hand) {
			builder.append(" ").append(card).append("\n");
		}
		return builder.toString();
	}
	// Flip method
	public Card flip() {
		if(hand.isEmpty()) {
			throw new IllegalStateException("Deck is empty -cannot draw!");
		}
		return hand.remove(0);	
	}
	// Draw method
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	//Increment method
	public void incrementScore() {
		points += 1;
	}



	
	
	

	

}
