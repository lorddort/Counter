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

public class SubFramework extends JFrame {
    private static SubFramework subFrame;

    GridLayout basisLayout = new GridLayout(0, 2);
    JPanel lowerButtonGrid = new JPanel();	
    JPanel upperButtonGrid = new JPanel();
    JPanel metaField = new JPanel();

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
	lowerButtonGrid.setLayout(basisLayout);
	upperButtonGrid.setLayout(basisLayout);
	metaField.setLayout(basisLayout);
	
	String[] currentDeckInfo = Commands.getDeck().getCurrentDeckInfo();

	JTextField plusText = new JTextField();
	JTextField minusText = new JTextField();
	JTextField nameText = new JTextField();
	JTextField classText = new JTextField();
	
	JLabel plusLabel = new JLabel(currentDeckInfo[2]);
	JLabel minusLabel = new JLabel(currentDeckInfo[3]);
	JLabel nameLabel = new JLabel(currentDeckInfo[0]);
	JLabel classLabel = new JLabel(currentDeckInfo[1]);
	
	
	metaField.add(plusLabel);
	metaField.add(minusLabel);
	metaField.add(nameLabel);
	metaField.add(classLabel);

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
		if(edit.getText().matches("EDIT")) {
		    Commands.chooseCommand(Commands.getDeck(), edit.getText());
		    plusText.setText(plusLabel.getText());
		    minusText.setText(minusLabel.getText());
		    nameText.setText(nameLabel.getText());
		    classText.setText(classLabel.getText());
		    metaField.remove(plusLabel);
		    metaField.remove(minusLabel);
		    metaField.remove(nameLabel);
		    metaField.remove(classLabel);
		    metaField.add(plusText);
		    metaField.add(minusText);
		    metaField.add(nameText);
		    metaField.add(classText);
		    revalidate();
		    repaint();
		    edit.setText("DONE");
		} else {
		    plusLabel.setText(plusText.getText());
		    minusLabel.setText(minusText.getText());
		    nameLabel.setText(nameText.getText());
		    classLabel.setText(classText.getText());
		    metaField.remove(plusText);
		    metaField.remove(minusText);
		    metaField.remove(nameText);
		    metaField.remove(classText);
		    metaField.add(plusLabel);
		    metaField.add(minusLabel);
		    metaField.add(nameLabel);
		    metaField.add(classLabel);
		    revalidate();
		    repaint();
		    edit.setText("EDIT");
		}
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
	JButton plus = new JButton("Wins");
	plus.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent e) {
		int winsValue = Integer.parseInt(plusLabel.getText());
		winsValue++;
		plusLabel.setText(Integer.toString(winsValue));
	    }
	});

	/*
	 * Create and perform action for - Button
	 */
	JButton minus = new JButton("Loses");
	minus.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent e) {
		int losesValue = Integer.parseInt(minusLabel.getText());
		losesValue++;
		minusLabel.setText(Integer.toString(losesValue));
	    }
	});

	// Add buttons to frame with Grid Layout
	lowerButtonGrid.add(save);
	lowerButtonGrid.add(delete);
	lowerButtonGrid.add(edit);
	lowerButtonGrid.add(returnToFrame);
	upperButtonGrid.add(plus);
	upperButtonGrid.add(minus);

	pane.add(upperButtonGrid, BorderLayout.NORTH);
	pane.add(metaField, BorderLayout.CENTER);
	// pane.add(new JSeparator(), BorderLayout.CENTER);
	pane.add(lowerButtonGrid, BorderLayout.SOUTH);
    }

    /**
     * Create the GUI and show it. For thread safety, this method is invoked from
     * the event dispatch thread.
     */
    private static void createAndShowGUI() {
	// Create and set up the window.
	subFrame = new SubFramework("Counter");
	subFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	// Set up the content pane.
	subFrame.addComponentsToPane(subFrame.getContentPane());

	// Display the window.
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
	    // UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
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

	// Schedule a job for the event dispatch thread:
	// creating and showing this application's GUI.
	javax.swing.SwingUtilities.invokeLater(new Runnable() {
	    public void run() {
		createAndShowGUI();
	    }
	});
    }
}
