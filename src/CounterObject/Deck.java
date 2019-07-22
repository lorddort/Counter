package CounterObject;

public class Deck {
	
	String deckName;
	Heroes heroes;	
	int wins, loses;
	
	public Deck(String deckName, Heroes heroes, int wins, int loses) {
		this.deckName = deckName;
		this.heroes = heroes;
		this.wins = wins;
		this.loses = loses;
	}
	
	/**
	 * Count wins/loses of the deck
	 */
	public void counter() {
		
	}
	
	/**
	 * save the current deck
	 */
	public void saveDeck() {
		
	}
	
	/**
	 * load a existing deck
	 */
	public void loadDeck() {
		
	}
}
