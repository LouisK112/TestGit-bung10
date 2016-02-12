package validation;

public class InvalidStringLengthException extends ValidationException{

	/**
	 * Exception, falls ein String nicht einer bestimmten Länge entspricht
	 */
	public InvalidStringLengthException() {
		super("String entspricht nicht der vorgesehen Länge.");
	}

}
