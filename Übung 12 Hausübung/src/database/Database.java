package database;

/**
 * Provides an interface for simple database operations.
 * @author Anna S.
 */
public interface Database {
	/**
	 * Adds a new {@link Customer} to the database.
	 * @param emailAddress the email address of the customer.
	 * @param firstName the first name of the customer.
	 * @param lastName the last name of the customer
	 * @param interests the topics the customer want to be informed about as an enum array.
	 * @throws CustomerAlreadyExistsException is thrown when a customer with the given emailAddress already exists.
	 */
	public void addCustomer(String emailAddress, String firstName, String lastName, Interests[] interests) 
			throws CustomerAlreadyExistsException;
	
	/**
	 * Removes an already existing {@link Customer} from the database.
	 * @param emailAddress the email address of the customer
	 * @throws NoSuchCustomerException is thrown when no customer with the given emailAddress is found.
	 */
	public void removeCustomer(String emailAddress) throws NoSuchCustomerException;
	
	/**
	 * Retrieves the {@link Customer} with the given emailAddress from the database.
	 * @param emailAddress the email address of the customer
	 * @return the Customer with the given emailAddress
	 * @throws NoSuchCustomerException is thrown when no customer with the given emailAddress is found.
	 */
	public Customer getCustomer(String emailAddress) throws NoSuchCustomerException;
}
