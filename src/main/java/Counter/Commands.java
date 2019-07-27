package main.java.Counter;

import java.util.Scanner;

public enum Commands {
	NEW{
		@Override
		public void execute() {
			System.out.println("Done");
		}
	},
	LOAD{
		@Override
		public void execute() {
			System.out.println("Done");
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
			System.out.println("Done");
		}
	},
	DELETE{
		@Override
		public void execute() {
			System.out.println("Done");
		}
	},
	EDIT{
		@Override
		public void execute() {
			System.out.println("Done");
		}
	},
	RETURN{
		@Override
		public void execute() {
			System.out.println("Done");
		}
	};
	
	private static Menu menu = new Menu();
	private static Scanner userInput = new Scanner(System.in);
	private static boolean RUNNING = true;
	
	public static Commands chooseCommand() throws Exception{
		menu.showMenu();
		String input = userInput.nextLine();
		for(Commands command:Commands.values()) {
			if(input.matches(command.name().toLowerCase())) {
				command.execute();
				return command;
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