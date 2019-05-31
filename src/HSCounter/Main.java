package HSCounter;

public class Main {
	
	/**
	 * Main method
	 */
	public static void main(String[] args) {
		GeneralCommands generalCommand = new GeneralCommands();
		
		do {
			generalCommand.commands();
		} while (generalCommand.RUNNING);
	}
}
