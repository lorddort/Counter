package main.java.Counter.GUI;

public class Main {
	private static boolean RUNNING = true;
	private static int menu = 1;

	public static void main(String[] args) {
		Framework frame = new Framework();
		SubFramework sub = new SubFramework("Counter");
		
		while(RUNNING) {
			if(menu == 1) {
			frame.FrameWork();
			} else if(menu == 2) {
			sub.SubFrame();
			}
		}
	}

	public static int getMenu() {
		return menu;
	}

	public static void setMenu(int menu) {
		Main.menu = menu;
	}
}
