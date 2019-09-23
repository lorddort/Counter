package main.java.Counter.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

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
		Commands.chooseCommand(deck, commands);
		Framework.getFrame().dispose();
		SubFramework.SubFrame();
	}
	
}
