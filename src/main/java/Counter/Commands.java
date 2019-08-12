package main.java.Counter;

import java.util.Scanner;

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
			if(RUNNING == true) {
				RUNNING = false;
			}
		}
	},
	SAVE{
		@Override
		public void execute() {
			deck.save();
			menu.setShowMenu(2);
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
			menu.setShowMenu(2);
		}
	},
	RETURN{
		@Override
		public void execute() {
			menu.setShowMenu(1);
		}
	};
	
	private static Menu menu = new Menu();
	private static Deck deck = new Deck();
	private static Scanner userInput = new Scanner(System.in);
	private static boolean RUNNING = true;
	
	public static int chooseCommand(Deck deck, String commands) throws Exception{
		menu.showMenu();
		String input = commands;
		for(Commands command:Commands.values()) {
			if(input.toUpperCase().matches(command.name())) {
				command.execute();
				if(menu.getShowMenu() == 2){
					menu.setShowMenu(1);
				} else if(menu.getShowMenu() == 1) {
					menu.setShowMenu(2);
				}
				return menu.getShowMenu();
			}
		}
		if(menu.getShowMenu() == 2){
			menu.setShowMenu(1);
		} else if(menu.getShowMenu() == 1) {
			menu.setShowMenu(2);
		}
		throw new Exception("invalid Command");
	}
		
	/**
	 * Execute the given options
	 */
	public abstract void execute();

	public static boolean isRunning() {
		return RUNNING;
	}
}
