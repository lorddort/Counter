package main.java.Counter;

public class Menu {
	int showMenu = 1;
	
	/**
	 * decide which menu will shown
	 */
	public void showMenu() {
		System.out.println("Choose an option:");
		if(showMenu == 1) {
			menu1();
			showMenu = 2;
		} else if(showMenu == 2) {
			menu2();
			showMenu = 1;
		}
	}
	
	public int getShowMenu() {
		return showMenu;
	}

	public void setShowMenu(int showMenu) {
		this.showMenu = showMenu;
	}

	/**
	 * List all options for menu1
	 * Maybe not needed
	 */
	public void menu1() {
		System.out.println(Commands.NEW.name() + "\n" + Commands.LOAD.name() + "\n" + Commands.EXIT.name());
	}
	
	/**
	 * List all options for menu2
	 * Maybe not needed
	 */
	public void menu2() {
		System.out.println(Commands.SAVE.name() + "\n" + Commands.DELETE.name() + "\n" + Commands.EDIT.name() + "\n" + Commands.RETURN.name());
	}
}
