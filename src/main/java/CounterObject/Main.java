package main.java.CounterObject;

public class Main {
	public static void main(String[] args) {
		Menu menu = new Menu();
		do {
			menu.showOptions();
		} while(Options.RUNNNING == true);
	}

}
