package database;

/**
 * 
 * @author Louis
 *
 */
public class NoSuchCustomerException extends DatabaseException {

	/**
	 * Exception, falls sich ein gesuchter Kunde nicht in der Datenbank befindet
	 */
	public NoSuchCustomerException() {
		super("Dieser Kunde befindet sich nicht der Datenbank!");
	}

}
