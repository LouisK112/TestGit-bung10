/**
 * 
 */
package service;

import validation.*;
import database.*;



/**
 * @author Louis
 *
 */


public class NewsletterRegistration implements Registration {

	NewsletterDatabase NewsDatenbank;
	
	/**
	 * Konstruktor
	 */
	public NewsletterRegistration() {
		NewsDatenbank = new NewsletterDatabase();
	}

	@Override
	public String registerNewCustomer(String firstName, String lastName, String emailAddress, String[] interests) {
		String answer = "Der Kunde wurde erfolgreich registriert";
		
		try{
			FormValidator.validateEMailAddress(emailAddress);
			FormValidator.validateName(firstName);
			FormValidator.validateName(lastName);
			NewsDatenbank.addCustomer(emailAddress,firstName,lastName,FormValidator.validateInterests(interests));
			
			return answer;
		}
		catch (InvalidInterestsException ex) {return ex.getMessage();}
		catch (InvalidAddressFormatException ex) {return ex.getMessage(); }
		catch (InvalidStringLengthException ex) {return ex.getMessage(); }
		catch (InvalidCharacterException ex) {return ex.getMessage(); }
		catch (CustomerAlreadyExistsException ex) {return ex.getMessage(); }
		
		
		
	}
		
			
	@Override
	public String updateInterests(String emailAddress, String[] interests) {
		String answer = "Update war erfolgreich!";
		
		try {
			
			Customer cu = NewsDatenbank.getCustomer(emailAddress);
			cu.setInterests(FormValidator.validateInterests(interests));
			
			return answer;
			
			
		}

		
		catch (NoSuchCustomerException ex) {return ex.getMessage();}
		catch (InvalidInterestsException ex) {return ex.getMessage();}
		
		}

	

}
