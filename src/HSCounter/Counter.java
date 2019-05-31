package HSCounter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Counter {
	Formatter newFile = null;
	Scanner scan = new Scanner(System.in);
	
	/**
	 * create a new File
	 * @param pickHero User selected Hero
	 * @return if file already exist
	 */
	public boolean createNewFile(String pickHero) {
		File file = new File("/Users/lorddort/Desktop/java/MyProjects/HSCounter/" + pickHero +".txt");
		if(!(file.exists())) {
			try {
				newFile = new Formatter("/Users/lorddort/Desktop/java/MyProjects/HSCounter/" + pickHero + ".txt");
				System.out.println("New File created");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.err.println("File already exist. Please use another name");
			return true;
		}
		return true;
	}
	
	/**
	 * Check if file already exist
	 * @param pickHero
	 * @return
	 */
	public boolean checkExistingFile(String pickHero) {
		File file = new File("/Users/lorddort/Desktop/java/MyProjects/HSCounter/" + pickHero +".txt");
		if(!(file.exists())) {
			System.err.println("File not exist");
			return true;
		}
		return false;
	}
	
	/**
	 * Rewrite file
	 */
	public void rewriteNewFiles() {
		int wins = 0;
		int loses = 0;
		boolean writeCommand = true;
		do {
			String input = scan.nextLine();
			if (input.equals("win")) {
				wins++;
				Terminal.printLine(wins + " : " + loses);
			} else if (input.equals("lose")) {
				loses++;
				Terminal.printLine(wins + " : " + loses);
			} else if (input.equals("back to menu")) {
				writeCommand = false;
			} else {
				System.err.println("Invalid input");
			}
		} while(writeCommand);
	String numberWord = Integer.toString(wins) + " : " + Integer.toString(loses);
	newFile.format("%s", numberWord);
	newFile.close();
	}

}
