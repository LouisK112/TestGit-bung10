/**
 * 
 */
package database;

import java.util.*;

/**
 * @author Louis
 *
 */
public class NewsletterDatabase implements Database {

	Map<String,Customer> Datenbank;
	
	/**
	 * Konstuktor 
	 */
	public NewsletterDatabase() {
		Datenbank  = new HashMap<String,Customer>();
	}

	@Override
	public void addCustomer(String emailAddress, String firstName, String lastName, Interests[] interests)
			throws CustomerAlreadyExistsException {
		if (!Datenbank.containsKey(emailAddress)) 
			Datenbank.put(emailAddress, new Customer(firstName, lastName, emailAddress,interests));
		throw new CustomerAlreadyExistsException();
		
	}

	@Override
	public void removeCustomer(String emailAddress) throws NoSuchCustomerException {
		if (Datenbank.containsKey(emailAddress))
			Datenbank.remove(emailAddress);
		throw new NoSuchCustomerException();
		
	}

	@Override
	public Customer getCustomer(String emailAddress) throws NoSuchCustomerException {
		if (Datenbank.containsKey(emailAddress))
			return Datenbank.get(emailAddress);
		throw new NoSuchCustomerException();
		
	}

}
