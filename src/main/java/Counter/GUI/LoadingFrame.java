package main.java.Counter.GUI;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;

public class LoadingFrame {
	private JFileChooser loadFrame;
	
	public LoadingFrame() {
		loadFrame = new JFileChooser();
		JFrame frame = new JFrame("Deckauswahl");
		
		frame.setSize(450, 300);
		frame.getContentPane().add(loadFrame);
		frame.setResizable(false);
		frame.setVisible(false);
	}
	
	public void loadingFile(String deckname) {
		
	}
	
	/**
	 * Selection when clicking LOAD
	 * 
	 */
	public void loadChoosingPanel() {
	    JList DeckNameList = new JList();
	}
}
//TODO implement it