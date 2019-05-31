package HSCounter;

import java.util.Scanner;

public class Rerun {
	Counter counter = new Counter();
	Scanner choice = new Scanner(System.in);
	
	/**
	 * Look if the given file exist
	 */
	public void countinue() {
		boolean fileExist = true;
		while(fileExist) {
			System.out.println("Please choose the file you want to continue");
			String pickHero = choice.nextLine();
			fileExist = counter.checkExistingFile(pickHero);
		}
	}

}
