package HSCounter;

import java.util.Scanner;

import Hearthstone.Counter;

public class Heroes {
	Counter counter = new Counter();
	Scanner choice = new Scanner(System.in);
	private static final String WARRIOR = "Warrior";
	private static final String SHAMAN = "Shaman";
	private static final String ROGUE = "Rogue";
	private static final String PALADIN = "Paladin";
	private static final String HUNTER = "Hunter";
	private static final String DRUIDE = "Druide";
	private static final String WARLOCK = "Warlock";
	private static final String MAGE = "Mage";
	private static final String PRIESTER = "Priester";
	
	boolean answer;
	String question;
	
	/**
	 * Selected a Hero
	 */
	public void selectHero() {
		System.out.println("Select your Hero:\n" + WARRIOR +"/" + SHAMAN +"/" + ROGUE +"/" + PALADIN +"/" + HUNTER +"/" + DRUIDE +"/" + WARLOCK +"/" + MAGE +"/" + PRIESTER);
		String pickHero;
		boolean error;
		do {	
			pickHero = choice.nextLine();
			error = checkForClass(pickHero);
		} while(error);
		System.out.println("Do you want to count the Class?");
		do {
			question = choice.nextLine();
			answer = checkYesNoQuestion(question);
		} while (answer);
		if (question.matches("Yes")) {
			System.out.println("Write 'win' to count wins and 'lose' for loses.\nWrite 'back to menu' to save your score and go back to menu");
			counter.rewriteNewFiles();
		}
	}
	
	/**
	 * Check if class exist
	 * @param pickHero Users selected Hero
	 * @return if the selected class is a hero 
	 */
	public boolean checkForClass(String pickHero) {
		if(!(pickHero.matches(WARRIOR) || pickHero.matches(SHAMAN) || pickHero.matches(ROGUE) || pickHero.matches(PALADIN) || pickHero.matches(HUNTER) || pickHero.matches(DRUIDE) 
				|| pickHero.matches(WARLOCK) || pickHero.matches(MAGE) || pickHero.matches(PRIESTER))) {
			System.err.println("Not a class! Pick a Hero again");
			return true;
		}
		return false;
	}
	
	/**
	 * Check if answer is correct
	 * @param yn to answer
	 * @return if the answer is correct
	 */
	public boolean checkYesNoQuestion(String yn) {
		if(!(yn.matches("Yes") || yn.matches("No"))) {
			return true;
		} else {
			return false;
		}
	}
}
