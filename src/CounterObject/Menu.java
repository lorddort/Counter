package CounterObject;

import java.util.Scanner;

public class Menu {
	Scanner choice;
	Options choosenOption;
	
	/**
	 * show Main Menu
	 */
	public void showOptions() {
		System.out.println("Choose an option:");
		allOptions();
		chooseOptions();
	}
	
	/**
	 * User chose an Option
	 */
	public void chooseOptions() {
		choice = new Scanner(System.in);
		String input = choice.nextLine();
		for(Options option: Options.values()) {
			if(input.matches(option.name().toLowerCase())) {
				option.execute();
			}
		}
	}
	
	/**
	 * List all option
	 */
	public void allOptions() {
		for(Options option: Options.values()) {
			System.out.println(option.name());
		}
	}
}
