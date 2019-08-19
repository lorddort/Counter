package main.java.Counter;

import java.util.Scanner;

import main.java.Counter.GUI.Main;

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
			Main.setMenu(2);
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
			Main.setMenu(2);
		}
	},
	RETURN{
		@Override
		public void execute() {
			Main.setMenu(1);
		}
	};
	
	//private static Menu menu = new Menu();
	private static Deck deck = new Deck();
	private static Scanner userInput = new Scanner(System.in);
	private static boolean RUNNING = true;
	
	public static void chooseCommand(Deck deck, String commands) throws Exception{
		//menu.showMenu();
		String input = commands;
		for(Commands command:Commands.values()) {
			if(input.toUpperCase().matches(command.name())) {
				command.execute();
				if(Main.getMenu() == 2){
					Main.setMenu(1);
				} else if(Main.getMenu() == 1) {
					Main.setMenu(2);
				}
			}
		}
		if(Main.getMenu() == 2){
			Main.setMenu(1);
		} else if(Main.getMenu() == 1) {
			Main.setMenu(2);
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
