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
		}
	},
	DELETE{
		@Override
		public void execute() {
			deck.delete();
		}
	},
	EDIT{
		@Override
		public void execute() {
			deck.edit();
		}
	},
	PLUS{
		@Override
		public void execute() {
			deck.counting(true);
		}
	},
	MINUS{
		@Override
		public void execute() {
			deck.counting(false);
		}
	},
	RETURN {
		@Override
		public void execute() {}
	};
	
	private static Deck deck = new Deck();
	
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

