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
	
	public Classes addComponentsToPaneHero() {
		Classes klass = (Classes) JOptionPane.showInputDialog(null,
				"Bitte eine Klasse eingeben",
				"Klasse",
				JOptionPane.OK_OPTION, null, null, null);
		return klass;
		
	}
	
	public String createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        String deckName = addComponentsToPane();

        //Display the window.
        frame.setSize(200, 150);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocation(550, 150);
        
        return deckName;
    }
	
	public Classes createAndShowGUIHero() {
        //Create and set up the window.
        JFrame frame = new JFrame("Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        Classes klass = addComponentsToPaneHero();

        //Display the window.
        frame.setSize(200, 150);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocation(550, 150);
        
        return klass;
    }

}
