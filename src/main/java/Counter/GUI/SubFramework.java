package main.java.Counter.GUI;

import java.awt.BorderLayout;
import java.awt.Component;
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
	private static SubFramework subFrame;
	
    GridLayout experimentLayout = new GridLayout(0,2);
    
    /**
     * Constructor for SubFramework
     * 
     * @param name
     */
    public SubFramework(String name) {
        super(name);
        setResizable(false);
    }
    
    /**
     * Adding buttons and textfields
     * 
     * @param pane
     */
    public void addComponentsToPane(final Container pane) {
        JPanel compsToExperiment = new JPanel();
        compsToExperiment.setLayout(experimentLayout);
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(2,3));
        JPanel counterComps = new JPanel();
        counterComps.setLayout(experimentLayout);
        JPanel textField = new JPanel();
        textField.setLayout(experimentLayout);
        
        String[] currentDeckInfo = Commands.getDeck().getCurrentDeckInfo();     
        JLabel plusLabel = new JLabel("Wins:" + currentDeckInfo[2]);
        JLabel minusLabel = new JLabel("Loses:" + currentDeckInfo[3]);
    	textField.add(plusLabel);
    	textField.add(minusLabel);        
        textField.add(new Label("Deckname:" + currentDeckInfo[0]));
        textField.add(new Label("Class:" + currentDeckInfo[1]));
        
        /*
         * Create and perform action for SAVE Button
         */
        JButton save = new JButton(Commands.SAVE.name());
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Commands.chooseCommand(Commands.getDeck(), save.getText());
            }
        });
        
        /*
         * Create and perform action for DELETE Button
         */
        JButton delete = new JButton(Commands.DELETE.name());
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Commands.chooseCommand(Commands.getDeck(), delete.getText());
            	SubFramework.subFrame.dispose();
        	Framework.FrameWork();
            }
        });
        
        /*
         * Create and perform action for EDIT Button
         */
        JButton edit = new JButton(Commands.EDIT.name());
        edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Commands.chooseCommand(Commands.getDeck(), edit.getText());
            }
        });
        
        /*
         * Create and perform action for RETURN Button
         */
        JButton returnToFrame = new JButton(Commands.RETURN.name());
        returnToFrame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Commands.chooseCommand(Commands.getDeck(), returnToFrame.getText());
        	SubFramework.subFrame.dispose();
        	Framework.FrameWork();
            }
        });
        
        /*
         * Create and perform action for + Button
         */
        JButton plus = new JButton("+");
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Commands.chooseCommand(Commands.getDeck(), Commands.PLUS.name());
            	plusLabel.setText("Wins:" + Commands.getDeck().getWins());
            }
        });
        
        /*
         * Create and perform action for - Button
         */
        JButton minus = new JButton("-");
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Commands.chooseCommand(Commands.getDeck(), Commands.MINUS.name());
            	minusLabel.setText("Loses:" + Commands.getDeck().getLoses());
            }
        });
        
        //Add buttons to experiment with Grid Layout
        compsToExperiment.add(save);
        compsToExperiment.add(delete);
        compsToExperiment.add(edit);
        compsToExperiment.add(returnToFrame);
        counterComps.add(plus);
        counterComps.add(minus);
        
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
    	subFrame = new SubFramework("Counter");
        subFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Set up the content pane.
        subFrame.addComponentsToPane(subFrame.getContentPane());
        
        //Display the window.
        subFrame.setSize(400, 150);
        subFrame.setVisible(true);
    }
    
    /**
     * Get the SubFramework
     * 
     * @return
     */
    public static SubFramework getSubFrame() {
	return subFrame;
    }

    /**
     * Run the SubFramework
     */
    public static void SubFrame() {
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
