import java.util.List;

/**
 * Base class for a Book.
 * This holds basic information including ISBN, title, authors, year, city, publisher and edition of the bool.
 *
 * This class also contains a list of BookCopies, representing the amount of physically available copies of this book
 * in the library.
 */

public class Book {
    String isbn;
    String title;
    List<String> authors;
    int year;
    String city;
    String publisher;
    int edition;
    
    public  Book(String isbn, String title, List<String> authors, int year, String city, String publisher, int edition) {
    	this.isbn = isbn;
    	this.title = title;
    	this.authors = authors;
    	this.year = year;
    	this.city = city;
    	this.publisher = publisher;
    	this.edition = edition;
    }

    public Book(final String title){
        this.title = title;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

}


