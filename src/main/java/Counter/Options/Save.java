package main.java.Counter.Options;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Formatter;

import main.java.Counter.Classes;

public class Save {
	String deckName;
	Classes classes;
	int wins;
	int loses;
	
	public Save(String deckName, Classes classes, int wins, int loses) {
		this.deckName = deckName;
		this.classes = classes;
		this.wins = wins;
		this.loses = loses;
	}
	
	public void saveDeck() throws Exception {
		FileWriter writer;
		File file;
		
		file = new File("src/main/resources/test.txt");
		writer = new FileWriter(file, true);
		writer.write(deckName + ", " + classes + ", " + Integer.toString(wins) + ", " + Integer.toString(loses));
		writer.write(System.getProperty("line.separator"));
		writer.flush();
		writer.close();
	}
}
