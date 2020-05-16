import java.util.Date;

public class BookCopy {
        long id;
        Book book;
        String shelfLocation;
        Date addedLibrary;
        boolean lent;
        Date lentDate;

        public BookCopy(Book book, long id, boolean lent, Date lentDate, String shelfLocation){
                this.book = book;
                this.id = id;
                this.lent = lent;
                this.lentDate = lentDate;
                this.shelfLocation = shelfLocation;
        }

        public long getId() {
                return id;
        }

        public Book getBook() {
                return book;
        }

        public String getShelfLocation() {
                return shelfLocation;
        }

        public Date getAddedLibrary() {
                return addedLibrary;
        }

        public boolean isLent() {
                return lent;
        }

        public Date getLentDate() {
                return lentDate;
        }

        public void setId(long id) {
                this.id = id;
        }

        public void setBook(Book book) {
                this.book = book;
        }

        public void setShelfLocation(String shelfLocation) {
                this.shelfLocation = shelfLocation;
        }

        public void setAddedLibrary(Date addedLibrary) {
                this.addedLibrary = addedLibrary;
        }

        public void setLent(boolean lent) {
                this.lent = lent;
        }

        public void setLentDate(Date lentDate) {
                this.lentDate = lentDate;
        }
}
