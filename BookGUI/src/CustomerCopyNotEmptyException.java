public class CustomerCopyNotEmptyException extends Exception{
    /**
     * This Exception gets thrown by Library.deleteCustomer() if the Customer to delete still has book
     * copies borrowed.
     * @param errorMessage
     */
    public CustomerCopyNotEmptyException(String errorMessage) {
        super(errorMessage);
    }
}
