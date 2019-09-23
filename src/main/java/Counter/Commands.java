package main.java.Counter;

import java.awt.event.WindowEvent;
import main.java.Counter.GUI.Framework;

public enum Commands {
	NEW{
		@Override
		public void execute() {
			deck.create();
		}
	},
	LOAD{
		@Override
		public void execute() {
			deck.load();
			//TODO loading screen
		}
	},
	EXIT{
		@Override
		public void execute() {
			Framework.getFrame().dispatchEvent(new WindowEvent(Framework.getFrame(), WindowEvent.WINDOW_CLOSING));
		}
	},
	SAVE{
		@Override
		public void execute() {
			deck.save();
			//TODO somehow get to Menu
		}
	},
	DELETE{
		@Override
		public void execute() {
			deck.delete();
			//TODO somehow get to Menu
		}
	},
	EDIT{
		@Override
		public void execute() {
			deck.edit();
			//TODO somehow get to Menu
		}
	},
	RETURN{
		@Override
		public void execute() {
			//TODO somehow get to Menu
		}
	};
	
	private static Deck deck = new Deck();
	private static boolean RUNNING = true;
	
	public static void chooseCommand(Deck deck, String commands) {
		String input = commands;
		for(Commands command:Commands.values()) {
			if(input.toUpperCase().matches(command.name())) {
				command.execute();
			}
		}
	}
		
	/**
	 * Execute the given options
	 */
	public abstract void execute();
	
	public static Deck getDeck() {
		return deck;
	}
}
