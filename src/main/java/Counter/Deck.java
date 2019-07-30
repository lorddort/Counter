package main.java.Counter;

import main.java.Counter.Options.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Deck {
	ArrayList<String[]> currentList = new ArrayList<>();
	String[] deckInfo = new String[4];
	Scanner user = new Scanner(System.in);
	Classes classes;
	New newDeck;
	int wins;
	int loses;
	
	public void create() {
		System.out.println("Please insert class");
		String hero = user.nextLine();
		Classes classes = Classes.getClass(hero);
		System.out.println("Please insert name for your deck.");
		String deckName = user.nextLine();
		wins = 0;
		loses = 0;
		newDeck = new New(deckName, classes, wins, loses);
		
		newDeck.createNew(currentList, deckInfo);
	}
	
	public void load() {
		
	}
	
	public void save() {
		
	}
	
	public void delete() {
		
	}
	
	public void edit() {
		
	}
}
