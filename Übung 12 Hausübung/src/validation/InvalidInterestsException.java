package validation;

public class InvalidInterestsException extends ValidationException{

	/**
	 * Exception, falls nicht passende Interessenfelder übergeben wurden.
	 */
	public InvalidInterestsException() {
		super("Es wurden keine/nicht passende Interessenfelder übergeben.");
	}

}
