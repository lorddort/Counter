package main.java.CounterObject;

import java.util.Scanner;

public class Menu {
	Scanner input;
	Options choosenOption;
	
	/**
	 * show Main Menu
	 */
	public void showOptions() {
		System.out.println("Choose an option:");
		menu1Options();
		chooseOptions();
	}
	
	/**
	 * User chose an Option
	 */
	public void chooseOptions() {
		input = new Scanner(System.in);
		String inputString = input.nextLine();
		for(Options option: Options.values()) {
			if(inputString.matches(option.name().toLowerCase())) {
				System.out.println("Please choose a Hero:");
				String heroInString = input.nextLine().toUpperCase();
				Heroes hero = Heroes.getHero(heroInString);
				System.out.println("Please insert a name:");
				String name = input.nextLine();
				int wins = 0;
				int loses = 0;
				option.execute(name, hero, wins, loses);
			}
		}
	}
	
	/**
	 * List all options for menu1
	 */
	public void menu1Options() {
		System.out.println(Options.NEW.toString() + "\n" + Options.LOAD.toString() + "\n" + Options.EXIT.toString());
	}
	
	public void menu2Options() {
		
	}
}
