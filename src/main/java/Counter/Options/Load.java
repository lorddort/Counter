package main.java.Counter.Options;

import java.io.File;
import java.util.Scanner;

import main.java.Counter.Classes;

public class Load {
	String deckName;
	Classes classes;
	Scanner scanTxt;
	
	public Load(String deckName, Classes classes) {
		this.deckName = deckName;
		this.classes = classes;
	}
	
	public void load() throws Exception{
		File file = new File("src/main/resources/test.txt");
		scanTxt = new Scanner(file);
		
		if(scanTxt.hasNextLine()) {
			String searchingName = scanTxt.
		}
	}
}
