package main.java.Counter.GUI;

import java.awt.Component;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import main.java.Counter.*;

public class Framework {
	private static JButton button1;
	private static JButton button2;
	private static JButton button3;
	private static JFrame frame;
	
    public static JFrame getFrame() {
		return frame;
	}

	public static void addComponentsToPane(Container pane) {
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
        
        addAButton(Commands.NEW.name(), pane);
        addAButton(Commands.LOAD.name(), pane);
        addAButton(Commands.EXIT.name(), pane);
    }

    private static void addAButton(String commands, Container container) {
        JButton button = new JButton(commands);
        Listener listen = new Listener(commands);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(button);
        button.addActionListener(listen);
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
