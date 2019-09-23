package main.java.Counter.GUI;

import main.java.Counter.Classes;
import main.java.Counter.GUI.*;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InputFramework {
	public String addComponentsToPane() {
		String deckName = (String) JOptionPane.showInputDialog(null,
				"Bitte gib einen Namen ein",
				"Decknamen",
				JOptionPane.OK_OPTION,
				null, null, null);
		return deckName;
	}
	
	public String addComponentsToPaneHero() {
		String klass = (String) JOptionPane.showInputDialog(null,
				"Bitte eine Klasse eingeben",
				"Klasse",
				JOptionPane.OK_OPTION, 
				null, null, null);
		return klass;
		
	}

}
