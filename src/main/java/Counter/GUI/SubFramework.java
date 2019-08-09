package main.java.Counter.GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import main.java.Counter.*;

public class SubFramework extends JFrame{
    GridLayout experimentLayout = new GridLayout(0,2);
    Deck deck = new Deck();
    
    public SubFramework(String name) {
        super(name);
        setResizable(false);
    }
    
    public void addComponentsToPane(final Container pane) {
        JPanel compsToExperiment = new JPanel();
        compsToExperiment.setLayout(experimentLayout);
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(2,3));
        JPanel counterComps = new JPanel();
        counterComps.setLayout(experimentLayout);
        JPanel textField = new JPanel();
        textField.setLayout(experimentLayout);
        
        //Add buttons to experiment with Grid Layout
        compsToExperiment.add(new JButton(Commands.SAVE.name()));
        compsToExperiment.add(new JButton(Commands.DELETE.name()));
        compsToExperiment.add(new JButton(Commands.EDIT.name()));
        compsToExperiment.add(new JButton(Commands.RETURN.name()));
        
        counterComps.add(new JButton("+"));
        counterComps.add(new JButton("-"));
        
        String[] deckInfo = deck.getCurrentDeckInfo();
        textField.add(new Label("Wins:" + deckInfo[2]));
        textField.add(new Label("Loses:" + deckInfo[3]));        
        textField.add(new Label("Deckname:" + deckInfo[0]));
        textField.add(new Label("Class:" + deckInfo[1]));
        
        pane.add(counterComps, BorderLayout.NORTH);
        pane.add(textField, BorderLayout.CENTER);
        //pane.add(new JSeparator(), BorderLayout.CENTER);
        pane.add(compsToExperiment, BorderLayout.SOUTH);
    }
    
    /**
     * Create the GUI and show it.  For thread safety,
     * this method is invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
    	SubFramework frame = new SubFramework("Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Set up the content pane.
        frame.addComponentsToPane(frame.getContentPane());
        
        //Display the window.
        frame.setSize(400, 150);
        frame.setVisible(true);
    }
    
    public void SubFramework() {
        /* Use an appropriate Look and Feel */
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
