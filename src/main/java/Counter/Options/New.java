package main.java.Counter.Options;

import java.util.ArrayList;

import main.java.Counter.Classes;

public class New {
    String deckName;
    Classes classes;
    int wins;
    int loses;

    public New(String deckName, Classes classes, int wins, int loses) {
	this.deckName = deckName;
	this.classes = classes;
	this.wins = wins;
	this.loses = loses;
    }

    public void createNew(ArrayList<String[]> currentList, String[] deckInfo) {
	deckInfo[0] = deckName;
	deckInfo[1] = classes.name();
	deckInfo[2] = Integer.toString(wins);
	deckInfo[3] = Integer.toString(loses);

	currentList.add(deckInfo);
    }
}
