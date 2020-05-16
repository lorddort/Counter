import java.util.HashMap;
import java.util.NoSuchElementException;

public class Library {
	HashMap<String, Book> bookList = new HashMap<String, Book>();
	HashMap<Long, BookCopy> bookCopyList = new HashMap<Long, BookCopy>();
	HashMap<Long, Customer> customerList = new HashMap<Long, Customer>();

	/**
	 * constructor with already given maps (lists) (for testing etc.)
	 * 
	 * @param bookList     HashMap with books
	 * @param bookCopyList HashMap with bookCopys
	 * @param customerList HashMap with customers
	 */
	protected Library(HashMap<String, Book> bookList, HashMap<Long, BookCopy> bookCopyList,
			HashMap<Long, Customer> customerList) {
		super();
		this.bookList = bookList;
		this.bookCopyList = bookCopyList;
		this.customerList = customerList;
	}

	public HashMap<String, Book> getBookList() {
		return bookList;
	}

	public HashMap<Long, BookCopy> getBookCopyList() {
		return bookCopyList;
	}

	public HashMap<Long, Customer> getCustomerList() {
		return customerList;
	}

	/**
	 * empty constructor
	 */
	public Library() {

	}

	public void addBook(Book book) {
		String isbn = book.isbn;
		this.bookList.put(isbn, book);
	}

	public void addBookCopy(BookCopy bookCopy) {
		long id = bookCopy.id;
		this.bookCopyList.put(id, bookCopy);
	}

	public void addCustomer(Customer customer) {
		long id = customer.getId();
		this.customerList.put(id, customer);
	}

	/**
	 * deletes book from bookList via ISBN. Necessary: No bookCopy of that book is
	 * being borrowed. Deletes every associated bookCopy.
	 * 
	 * @param isbn of book
	 */
	public void deleteBook(String isbn) throws Exception, NoSuchElementException {
		for(BookCopy copy : this.bookCopyList.values()) {
			if (copy.book.isbn == isbn && copy.lent) {
				throw new Exception();
			}
		}
		if(!this.bookList.keySet().contains(isbn)) {
			throw new NoSuchElementException("Kein Buch mit ISBN " + isbn + "gefunden!");
		}
		this.bookList.remove(isbn);
		System.out.println(this.bookList.values());
	}

	/**
	 * deletes bookCopy via id. The bookCopy is not being borrowed
	 * 
	 * @param bookCopyId
	 */
	public void deleteBookCopy(long bookCopyId) {

	}

	/**
	 * deletes customer. Customer can't have a borrowed book
	 * 
	 * @param customerId
	 */
	public void deleteCustomer(long customerId) throws CustomerCopyNotEmptyException, NoSuchElementException {
		boolean customerExists = false;
		for (Customer customer : this.customerList.values()) {
			if (customer.getId() == customerId) {
				customerExists = true;
				break;
			}
		}
		if (!customerExists) {
			throw new NoSuchElementException("Kein Kunde mit ID " +  Long.toString(customerId)+ " gefunden.");
		}

		if (!this.customerList.get(customerId).getBookCopies().isEmpty()) {
			throw new CustomerCopyNotEmptyException("Der Kunde hat noch ausgeliehene Buchkopien!");
		}
		this.customerList.remove(customerId);

	}

}
