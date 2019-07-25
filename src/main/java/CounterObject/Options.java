package main.java.CounterObject;

import java.io.IOException;
import java.util.Scanner;

public enum Options {
	NEW{
		@Override
		public void execute(String name, Heroes hero, int wins, int loses) {
			inputInformation = new Scanner(System.in);
			deck = new Deck(name, hero, wins, loses);
			deck.showDeckInformation();
		}
	},
	SAVE{
		@Override
		public void execute(String name, Heroes hero, int wins, int loses) {
			try {
				deck.saveDeck(name, hero, wins, loses);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	},
	LOAD{
		@Override
		public void execute(String name, Heroes hero, int wins, int loses) {
			
		}
	},
	DELETE{
		@Override
		public void execute(String name, Heroes hero, int wins, int loses) {
			
		}
	},
	EDIT{
		@Override
		public void execute(String name, Heroes hero, int wins, int loses) {
			
		}
	},
	EXIT{
		@Override
		public void execute(String name, Heroes hero, int wins, int loses) {
			if(RUNNNING == true) {
				RUNNNING = false;
			}
		}
	};

	Deck deck;
	Heroes hero;
	Scanner inputInformation;
	
	public static boolean RUNNNING = true;
	int wins;
	int loses;
	
	/**
	 * Execute the given options
	 */
	public abstract void execute(String name, Heroes hero, int wins, int loses);
}
