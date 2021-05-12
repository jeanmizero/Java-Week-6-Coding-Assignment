package starWar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CardTest {

	@Test
	void testToString() {
		// Given: a Card
		Card card = new Card("Justin", "Heart", 52);
		
		// When: the toString method is called
		String result  = card.toString();
		
		//Then: the result is collect
		assertEquals("Card: Jean of Heart: 52", result);
	}

}
