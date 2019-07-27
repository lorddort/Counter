package main.java.Counter;

public class Main {

	public static void main(String[] args) {
		Commands command = null;
        do {
            try {
                command = Commands.chooseCommand();
            } catch (Exception e) {
            	System.err.println(e.getMessage());
            }
        } while (Commands.isRunning());
	}

}
