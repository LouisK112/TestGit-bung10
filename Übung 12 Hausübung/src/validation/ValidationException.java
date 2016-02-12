package validation;

public class ValidationException extends Exception {

	/**
	 * Oberklasse für Exceptions
	 * @param fehler Fehlermeldung
	 */
	public ValidationException(String fehler) {
		super(fehler);
	
	}

}
