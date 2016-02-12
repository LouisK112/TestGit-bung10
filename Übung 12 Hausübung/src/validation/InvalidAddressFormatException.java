package validation;

public class InvalidAddressFormatException extends ValidationException{

	/**
	 * Exception, falls das Format der E-Mail-Addresse nicht den Richtlinien entspricht
	 */
	public InvalidAddressFormatException() {
		super("Das Format der eingegeben E-Mailadresse stimmt nicht. Überprüfen sie die Position des @-Zeichens");
	}

}
