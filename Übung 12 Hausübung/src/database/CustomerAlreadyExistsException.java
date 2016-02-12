/**
 * 
 */
package database;

/**
 * @author Louis
 *
 */
public class CustomerAlreadyExistsException extends DatabaseException{

	/**
	 * Exception, falls sich ein Kunde bereits in der Datenbank befindet
	 */
	public CustomerAlreadyExistsException() {
		super("Dieser Kunde befindet sich bereits in der Datenbank");
		
	}

}
