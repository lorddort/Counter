package main.java.Counter.Options;

import main.java.Counter.Classes;

public class Edit {
	String deckName;
	Classes classes;
	int wins;
	int loses;
	
	public Edit(String deckName) {
		this.deckName = deckName;
	}
	
	public String edit(String editName) {
		deckName = editName;
		return deckName;
	}
}
