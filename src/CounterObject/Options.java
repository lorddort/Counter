package CounterObject;

import java.util.Scanner;

public enum Options {
	NEW{
		@Override
		public void execute() {
			inputInformation = new Scanner(System.in);
			System.out.println("Please insert a name:");
			String name = inputInformation.nextLine();
			System.out.println("Please choose a Hero:");
			String heroInString = inputInformation.nextLine().toUpperCase();
			hero = Heroes.getHero(heroInString);
			wins = 0;
			loses = 0;
			deck = new Deck(name, hero, wins, loses);
			deck.showDeckInformation();
		}
	},
	SAVE{
		@Override
		public void execute() {
			
		}
	},
	LOAD{
		@Override
		public void execute() {
			
		}
	},
	DELETE{
		@Override
		public void execute() {
			
		}
	},
	EDIT{
		@Override
		public void execute() {
			
		}
	},
	EXIT{
		@Override
		public void execute() {
			
		}
	};

	Deck deck;
	Heroes hero;
	Scanner inputInformation;
	int wins;
	int loses;
	
	/**
	 * Execute the given options
	 */
	public abstract void execute();
}
