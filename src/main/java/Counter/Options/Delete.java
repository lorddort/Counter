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

    public void delete() throws Exception {
	String direction = "src/main/resources/test.txt";
	FileWriter writer;
	String[] deckInfo;

	File file = new File(direction);
	if (!file.canRead() || !file.isFile()) {
	    throw new Exception();
	}

	BufferedReader read = new BufferedReader(new FileReader(file));
	String line;
	while ((line = read.readLine()) != null) {
	    deckInfo = line.split(", ");
	    if (!(deckInfo[0].matches(deckName) && deckInfo[1].toUpperCase().matches(classes.name()))) {
		listTmp.add(deckInfo);
	    }
	}

	file.delete();
	writer = new FileWriter(file, true);

	for (int i = 0; i < listTmp.size(); i++) {
	    String[] newDeckInfo = listTmp.get(i);
	    writer.write(newDeckInfo[0] + ", " + newDeckInfo[1] + ", " + newDeckInfo[2] + ", " + newDeckInfo[3]);
	    writer.write(System.getProperty("line.separator"));
	    writer.flush();
	}
	writer.close();
	read.close();
    }
}
