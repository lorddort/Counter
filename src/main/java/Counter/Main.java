package main.java.Counter;

public class Main {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Commands command = null;
        do {
            try {
                command = Commands.chooseCommand(deck);
            } catch (Exception e) {
            	System.err.println(e.getMessage());
            }
        } while (Commands.isRunning());
	}

}
