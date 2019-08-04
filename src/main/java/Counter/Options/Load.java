package main.java.Counter.Options;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
		String direction = "src/main/resources/test.txt";
		
		File file = new File(direction);
		if (!file.canRead() || !file.isFile()) {
			throw new Exception();
		}
		BufferedReader read = new BufferedReader(new FileReader(file)); 
        String line; 
        while ((line = read.readLine()) != null) { 
        	String[] deckInfo = line.split(", ");
        	if(deckInfo[0].matches(deckName) && deckInfo[1].toUpperCase().matches(classes.name())) {
                System.out.println(line); 
        	}
        }
        read.close();
	}
}
