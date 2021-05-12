package starWar;

public class Card {
	//i. Fields : value and name
	private String person;
	private String name; 
	private int value;//rank
	 
	public Card( String person, String name, int value) {
		this.person = person;
		this.name = name;
		this.value = value;	
	}
	
	@Override
	public String toString() {
		return "Card: " + person + " of " + name + ": " + value ;
	}

	//ii. Methods: Getters and Setters
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	




}
