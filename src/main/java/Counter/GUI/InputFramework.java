package main.java.Counter.GUI;

import javax.swing.JOptionPane;
import javax.swing.JList;

public class InputFramework {
	
	/**
	 * Let the user input the name of the deck
	 * 
	 * @return
	 */
	public String addComponentsToPane() {
		String deckName = (String) JOptionPane.showInputDialog(null,
				"Bitte gib einen Namen ein",
				"Decknamen",
				JOptionPane.OK_OPTION,
				null, null, null);
		return deckName;
	}
	
	/**
	 * Let the user input the class
	 * 
	 * @return
	 */
	public String addComponentsToPaneHero() {
		String klass = (String) JOptionPane.showInputDialog(null,
				"Bitte eine Klasse eingeben",
				"Klasse",
				JOptionPane.OK_OPTION, 
				null, null, null);
		return klass;
		
	}
	
	/**
	 * Notify that the Input is wrong.
	 * 
	 * @param text
	 */
	public void errorMessage(String text) {
	    JOptionPane.showMessageDialog(null, text, "Fehlermeldung", JOptionPane.ERROR_MESSAGE);
	}

}
