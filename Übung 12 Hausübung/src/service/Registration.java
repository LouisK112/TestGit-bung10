package service;

/**
 * Provides an interface for simple newsletter registration related services
 * @author Anna S.
 */
public interface Registration {

	/**
	 * Receives information about a new {@link Customer}, validates them and then adds them to the newsletter database.
	 * @param firstName the first name of the customer
	 * @param lastName the last name of the customer
	 * @param emailAddress the email address of the customer
	 * @param interests the topics the customer wants to get informed about by the newsletter
	 * @return a status string describing in human readable form if the operation was successful or if something did go wrong
	 */
	public String registerNewCustomer(String firstName, String lastName, String emailAddress, String[] interests);
	
	/**
	 * Updates the interests of an already existing {@link Customer}.
	 * @param emailAddress the email address of the customer
	 * @param interests the new interest set
	 * @return a status string describing in human readable form if the operation was successful or if something did go wrong
	 */
	public String updateInterests(String emailAddress, String[] interests);
	
}
