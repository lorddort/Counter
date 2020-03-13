package main.java.Counter.Options;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import main.java.Counter.Classes;
import main.java.Counter.GUI.InputFramework;

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
	String line;

	file = new File("src/main/resources/test.txt");
	BufferedReader read = new BufferedReader(new FileReader(file));
	while ((line = read.readLine()) != null) {
	    String[] deckInfo = line.split(", ");
	    if (deckName.matches(deckInfo[0])) {
		new InputFramework().errorMessage("Name already used");
		read.close();
		throw new Exception();
	    }
	}
	read.close();
	writer = new FileWriter(file, true);
	writer.write(deckName + ", " + classes + ", " + Integer.toString(wins) + ", " + Integer.toString(loses));
	writer.write(System.getProperty("line.separator"));
	writer.flush();
	writer.close();
    }
}
