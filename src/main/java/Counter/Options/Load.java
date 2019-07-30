package main.java.Counter.Options;

import main.java.Counter.Classes;

public class Load {
	String deckName;
	Classes classes;
	int wins;
	int loses;
	
	public Load(String deckName, Classes classes, int wins, int loses) {
		this.deckName = deckName;
		this.classes = classes;
		this.wins = wins;
		this.loses = loses;
	}
}
