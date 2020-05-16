import java.util.Scanner;

public class GUI {
    /**
     * Prints the main menu of the application. From here, the use can select different functions and submenus
     */
    public void printMainMenu(Library lib) {
        String[] menuList = {"1. Buch ausleihen","2. Buch zurückgeben","3. Buchkopie suchen","4. Kundenverwaltung","5. Buchverwaltung", "0. Beenden"};
        System.out.println("LibraryAssistant. Es stehen folgende Optionen zur Verf\u00FCgung. Bitte eine der folgende Option ausw\u00E4hlen:");
        for(int i = 0; i < menuList.length; i++){
            System.out.println(menuList[i]);
        }
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean inputInvalid = true;
        while (inputInvalid) {
            switch (input) {
                case "1":
                    inputInvalid = false;
                    lendBook(lib);
                    break;
                case "2":
                    returnBook(lib);
                    inputInvalid = false;
                    break;
                //...
                case "3":
                    searchBookCopy(lib);
                    inputInvalid = false;
                    break;
                case "4":
                    printCustomerMenu(lib);
                    inputInvalid = false;
                    break;
                case "5":
                    printBookMenu(lib);
                    inputInvalid = false;
                    break;
                case "6":
                    printBookCopyMenu(lib);
                    inputInvalid = false;
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Fehlerhafte Eingabe, bitte wiederholen.");
                    input = scanner.nextLine();
            }
        }
    }

    /**
     * Prints the menu for managing Customers.
     */
    public void printCustomerMenu(Library lib) {
        System.out.println("Kundenverwaltung. Es stehen folgende Optionen zur Verf\u00FCgung.\nBitte eine Option ausw\u00E4hlen:");
        String[] customerMenu = {"1. Kundenliste ausgeben","2. Kunde l\u00F6schen","3. Ausleihen eines Kunden anzeigen","4. Kundenliste importieren","0. Zur\u00FCck zum Hauptmen\u00FC"};
        for(int i = 0; i < customerMenu.length; i++){
            System.out.println(customerMenu[i]);
        }
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean inputInvalid = true;
        while (inputInvalid) {
            switch (input) {
                case "1":
                    inputInvalid = false;
                    printMainMenu(lib);
                    break;
                case "2":
                    deleteCostumer(lib);
                    inputInvalid = false;
                    break;
                default:
                    System.out.println("Fehlerhafte Eingabe, bitte wiederholen.");
                    input = scanner.nextLine();
            }
        }

    }
    /**
     * Prints the menu for managing Books
     */
    public void printBookMenu(Library lib) {
        System.out.println("Buchverwaltung. Es stehen folgende Optionen zur Verf\u00FCgung.\nBitte Option ausw\u00E4hlen:");
        System.out.println("Bitte Option ausw\u00E4hlen:");
        String[] bookMenu = {"1. Buchliste ausgeben","2. Buch l\u00F6schen","3. Kundenliste importieren","0. Zur\u00FCck zum Hauptmen\u00FC"};
        for(int i = 0; i < bookMenu.length; i++){
            System.out.println(bookMenu[i]);
        }
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean inputInvalid = true;
        while (inputInvalid) {
            switch (input) {
                case "1":
                    inputInvalid = false;
                    printMainMenu(lib);
                    break;
                case "2":
                    deleteBook(lib);
                    inputInvalid = false;
                    break;
                //...
                case "3":
                    printMainMenu(lib);
                    inputInvalid = false;
                    break;
                case "0":
                    inputInvalid = false;
                    printMainMenu(lib);
                    break;
                default:
                    System.out.println("Fehlerhafte Eingabe, bitte wiederholen.");
                    input = scanner.nextLine();
            }
        }

    }
    /**
     * Prints the menu for managing book copies.
     */
    public void printBookCopyMenu(Library lib) {
        System.out.println("Buchkopieverwaltung. Es stehen folgende Optionen zur Verf\u00FCgung:");
        System.out.println("1. Ausgeliehene Kopien ausgeben");
        System.out.println("2. Nicht ausgeliehene ausgeben");
        System.out.println("3. Kopie l\u00F6schen");
        System.out.println("3. Buchkopieliste importieren");
        System.out.println("0. Zur\u00FCck zum Hauptmen\u00FC");
        System.out.println("Bitte Option ausw\u00E4hlen:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean inputInvalid = true;
        while (inputInvalid) {
            switch (input) {
                case "1":
                    inputInvalid = false;
                    printMainMenu(lib);
                    break;
                case "2":
                    deleteBook(lib);
                    inputInvalid = false;
                    break;
                //...
                case "3":
                    deleteCopy(lib);
                    inputInvalid = false;
                    break;
                case "0":
                    inputInvalid = false;
                    printMainMenu(lib);
                    break;
                default:
                    System.out.println("Fehlerhafte Eingabe, bitte wiederholen.");
                    input = scanner.nextLine();
            }
        }
    }

    /**
     * Handles the returning of book copies by asking for a customer ID and a BookCopy ID
     */
    public void returnBook(Library lib) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Buch-ID eingeben:");
        String bookID = scanner.nextLine();
        //TO-DO: Check if valid
        System.out.println("Buch " + bookID + " wurde erfolgreich zur\u00FCckgegeben!");
        printMainMenu(lib);
    }

    /**
     * Handles the lending process of books
     */
    public void lendBook(Library lib) {
        System.out.println("Bitte Kundennummer eingeben:");
        Scanner lendscanner = new Scanner(System.in);
        String CustomerID = lendscanner.nextLine();
        System.out.println("Bitte Buch-ID eingeben:");
        String bookID = lendscanner.nextLine();
        //TO-DO: Check if valid IDs
        System.out.println("Buch " + bookID + " wurde erfolgreich an Kunden " + CustomerID + " ausgeliehen!");

        printMainMenu(lib);
    }

    /**
     * Allows Searching for a Book by parameters specified by the user.
     */
    public void searchBookCopy(Library lib) {
        System.out.println("Hier kann man mal nach B\u00FCchern suchen.");
        printMainMenu(lib);

    }

    /**
     * Deletes a Book from the Library by asking for an ISBN and calling the corresponding function in Library
     */
    public void deleteBook(Library lib) {

    }
    /**
     * Deletes a Customer from the Library by asking for an ID and calling the corresponding function in Library
     */
    public void deleteCostumer(Library lib) {

    }
    /**
     * Deletes a BookCopy from the Library by asking for an ID and calling the corresponding function in Library
     */
    public void deleteCopy(Library lib) {

    }
}
