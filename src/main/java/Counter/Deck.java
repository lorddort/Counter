package main.java.Counter;

import main.java.Counter.Options.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Deck {
	ArrayList<String[]> currentList = new ArrayList<>();
	String[] deckInfo = new String[4];
	Scanner user = new Scanner(System.in);
	New newDeck;
	Save newSave;
	Classes classes;
	int wins;
	int loses;
	
	public void create() {
		System.out.println("Please insert class");
		String hero = user.nextLine();
		classes = Classes.getClass(hero);
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
		deckInfo = currentList.get(currentList.size()- 1);
		int winsTemp = Integer.parseInt(deckInfo[2]);
		int losesTemp = Integer.parseInt(deckInfo[3]);
		classes = Classes.getClass(deckInfo[1]);
		newSave = new Save(deckInfo[0], classes, winsTemp, losesTemp);
		
		try {
			newSave.saveDeck();
		} catch (Exception e) {
			System.err.println("I GOT TO CATCH THE EXPECTION");
		}
	}
	
	public void delete() {
		
	}
	
	public void edit() {
		
	}
}
