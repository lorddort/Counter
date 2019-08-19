package main.java.Counter.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.java.Counter.Commands;
import main.java.Counter.Deck;

public class Listener implements ActionListener {
	Deck deck = new Deck();
	String commands;
	
	public Listener(String commands) {
		this.commands = commands;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			Commands.chooseCommand(deck, commands);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
}
