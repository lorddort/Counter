package main.java.Counter.Options;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import main.java.Counter.Classes;

public class Delete {
	ArrayList<String[]> listTmp = new ArrayList<>();
	String deckName;
	Classes classes;
	
	public Delete(String deckName, Classes classes) {
		this.deckName = deckName;
		this.classes = classes;
	}
	
	public void delete(String fileName) throws Exception{
		String direction = "src/main/resources/" + fileName + ".txt";
		FileWriter writer;
		
		File file = new File(direction);
		if (!file.canRead() || !file.isFile()) {
			throw new Exception();
		}
		BufferedReader read = new BufferedReader(new FileReader(file)); 
        String line; 
        while ((line = read.readLine()) != null) { 
        	String[] deckInfo = line.split(", ");
        	if(!(deckInfo[0].matches(deckName) && deckInfo[1].toUpperCase().matches(classes.name()))) {
                listTmp.add(deckInfo);
        	}
        	writer = new FileWriter(file, true);
    		writer.write(deckInfo[0] + ", " + deckInfo[1] + ", " + deckInfo[2] + ", " + deckInfo[3]);
    		writer.write(System.getProperty("line.separator"));
            writer.flush();
            writer.close();
        }
        read.close();
        
        
		
		
	}
}
