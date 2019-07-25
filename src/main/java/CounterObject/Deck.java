package main.java.CounterObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

public class Deck {
	
	Formatter newFile;
	String deckName;
	Heroes heroes;	
	int wins, loses;
	boolean currentGameOutcome;
	
	public Deck(String deckName, Heroes heroes, int wins, int loses) {
		this.deckName = deckName;
		this.heroes = heroes;
		this.wins = wins;
		this.loses = loses;
	}
	
	/**
	 * Count wins/loses of the deck
	 */
	public void counter(boolean currentGameOutcome) {
		if(currentGameOutcome == true) {
			wins++;
		} else if(currentGameOutcome == false){
			loses++;
		}
	}
	
	/**
	 * save the current deck
	 * @param loses
	 * @param wins 
	 * @param hero 
	 * @param name 
	 * @throws IOException 
	 */
	public void saveDeck(String name, Heroes hero, int wins, int loses) throws IOException {
		FileWriter file = new FileWriter("/Users/lorddort/Desktop/eclipse-workspace/Counter/main/resources/test.txt");
		BufferedWriter writer = new BufferedWriter(file);
		writer.write(name + ", " + hero + ", " + Integer.toString(wins) + ", " + Integer.toString(loses));
		writer.newLine();
	}
	
	/**
	 * load a existing deck
	 */
	public void loadDeck() {
		
	}
	
	public void showDeckInformation() {
		System.out.println(deckName + ", " + heroes + ", " + wins + ", " + loses);
	}
}
