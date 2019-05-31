package HSCounter;

import java.util.Scanner;

public class GeneralCommands {
	Heroes heroes = new Heroes();
	Rerun rerun = new Rerun();
	Main main = new Main();
	Scanner syscall = new Scanner(System.in);
	
	public static boolean RUNNING = true;
	
	/**
	 * Command methode
	 */
	public void commands() {
		System.out.println("Choose an option:\nNew Class\nRerun saved Class\nExit");
		String userInput = syscall.nextLine();
		
		switch (userInput) {
			case "New Class":
				heroes.selectHero();
				break;
			case "Rerun saved Class":
				rerun.countinue();
				break;
			case "Exit":
				RUNNING = false;
				break;
			default: 
				System.err.println("Invalid Command");
		}
	}
	
	/**
	 * Return the value of RUNNING
	 * @return if programm is running or not
	 */
	private boolean isRunning() {
		return RUNNING;
	}
}
