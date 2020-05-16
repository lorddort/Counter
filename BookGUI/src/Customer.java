import java.util.List;

/**
 * This class models a customer of a library.
 * 
 * @author Lilian Cathérine Lepère
 *
 */
public class Customer {

	private final long id;
	private final String name;
	private final String address;
	private final String zipCode;
	private final String city;
	private boolean feesPayed;
	private List<BookCopy> bookCopies;

	public Customer(long id, String name, String address, String zipCode, String city, boolean feesPayed,
			List<BookCopy> bookCopies) {
		this.id= id;
		this.name= name;
		this.address = address;
		this.zipCode = zipCode;
		this.city = city;
		this.feesPayed = feesPayed;
		this.bookCopies = bookCopies;
	}

	protected final boolean isFeesPayed() {
		return feesPayed;
	}

	protected final void setFeesPayed(boolean feesPayed) {
		this.feesPayed = feesPayed;
	}

	protected final List<BookCopy> getBookCopies() {
		return bookCopies;
	}

	protected final void setBookCopies(List<BookCopy> bookCopies) {
		this.bookCopies = bookCopies;
	}

	protected final long getId() {

		return id;
	}

	protected final String getName() {
		return name;
	}

	private final String getAddress() {
		return address;
	}

	protected final String getZipCode() {
		return zipCode;
	}

	protected final String getCity() {
		return city;
	}
	
	
	
	//some more methods if required.

}
