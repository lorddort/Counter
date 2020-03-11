package main.java.Counter.GUI;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import main.java.Counter.*;

public class Framework {
    
    private static JFrame frame;
	
    private static Deck deck = new Deck();

    /**
     * Getter for JFrame
     * 
     * @return frame
     */
    public static JFrame getFrame() {
	return frame;
    }

    /**
     * Adding Buttons
     * 
     * @param pane - Interface where buttons are added
     */
    public static void addComponentsToPane(Container pane) {
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
        
        /*
         * Create and perform action for NEW Button
         */
        JButton create = new JButton(Commands.NEW.name());
        create.setAlignmentX(Component.CENTER_ALIGNMENT);
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Commands.chooseCommand(deck, create.getText());
        	Framework.getFrame().dispose();
        	SubFramework.SubFrame();
            }
        });
        
        /*
         * Create and perform action for LOAD Button
         */
        JButton load = new JButton(Commands.LOAD.name());
        load.setAlignmentX(Component.CENTER_ALIGNMENT);
        load.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Commands.chooseCommand(deck, load.getText());
        	Framework.getFrame().dispose();
        	SubFramework.SubFrame();
            }
        });
        
        /*
         * Create and perform action for EXIT Button
         */
        JButton exit = new JButton(Commands.EXIT.name());
        exit.setAlignmentX(Component.CENTER_ALIGNMENT);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Commands.chooseCommand(deck, exit.getText());
        	Framework.getFrame().dispose();
        	SubFramework.SubFrame();
            }
        });
        
        pane.add(create);
        pane.add(load);
        pane.add(exit);
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        frame = new JFrame("Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());

        //Display the window.
        frame.setSize(200, 150);
        frame.setResizable(false);
        frame.setLocation(550, 150);
        frame.setVisible(true);
    }

    /**
     * Run the Framework. Necessary the open the window.
     */
    public static void FrameWork() {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}
