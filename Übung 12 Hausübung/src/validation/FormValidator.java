/**
 * 
 */
package validation;


import database.Interests;

/**
 * @author Louis
 *
 */
public class FormValidator {

	/**
	 * Konstruktor
	 */
	public FormValidator() {
		
	}
	
	/**
	 * Überprüft, ob eine gegebene E-Mail-Addresse bestimmten Richtlinien folgt
	 * @param Address E-Mail-Addresse
	 * @throws InvalidAddressFormatException Exception, falls Addresse falsches Format hat
	 * @throws InvalidStringLengthException Exception, falls Addresse zu lang/kurz ist
	 */
	public static void validateEMailAddress(String Address) throws InvalidAddressFormatException, InvalidStringLengthException  {
		if (Address.length() < 8 || Address.length() > 254)
			throw new InvalidStringLengthException();
		
		if(Address.charAt(0) == '@' || Address.charAt(Address.length() - 1) == '@')
				throw new InvalidAddressFormatException();
		
		}
	
	/**
	 * Überprüft, ob gegebener Vor- oder Nachname bestimmten Richtlinien folgt
	 * @param name ein Name
	 * @throws InvalidStringLengthException Exception, falls Name zu lang/kurz
	 * @throws InvalidCharacterException Exception, falls nicht erlaubte Zeichen verwendet wurden
	 */
	public static void validateName(String name) throws InvalidStringLengthException, InvalidCharacterException {
		if(name.length() < 2 || name.length()> 30)
			throw new InvalidStringLengthException();
		if(!name.matches("[a-zA-Z]"))
			throw new InvalidCharacterException();
	}
	
	/**
	 * Überprüft, ob angegebene Interessen auch verfügbar sind
	 * @param interest angegebene Interessen des Kunden
	 * @return Array mit den möglichen Interessen
	 * @throws InvalidInterestsException Exception, falls das Interessengebiet nicht vorhanden ist
	 */
	public static Interests [] validateInterests (String [] interest) throws InvalidInterestsException {
		
		//Man hätte die Aufgaben auch einfach mit If-Bedingungen in einer for-Schleife lösen können.
		//Sollte man allerdings als Nutzer ein Interessengebiet hinzufügen wollen, muss man die Klassenhierarchie verstehen und im Code noch Anpassungen machen.
		//Zur einfacheren Nutzung habe ich es so programmiert, dass es unabhängig von den Intressengebieten läuft und ohne Probleme
		// Interessen hinzugefügt oder gelöscht werden können. Das erleichtert die Nutzung des Programms.
		
		
		String [] allEnums = new String [Interests.values().length];
		Interests [] result = new Interests [interest.length];
		
		//Interests-Elemente in ein neues Array mit Typ String umwandeln --> Einträge casten, damit man sie mit Array 'interest' vergleichen kann
		for(int i = 0; i<Interests.values().length; i++) {
			allEnums[i] = Interests.values()[i].toString(); 
		}
		
		//erste Bedingung Array nicht null und mindestens einen Eintrag
		if (interest != null && interest.length >= 1  ) {
			
				
			//Array einträge werden verglichen--> bei Gleichheit wird der Wert (als Interests!) in ein Array übertragen
			// für jedes eingegebene Interessengbiet wird geprüft, ob es sich in den Enums befindet
			for (int i=0; i<interest.length; i++){
				
				for (int j=0; j<allEnums.length; j++){
					
					if(allEnums[j].equals(interest[i]))
						result[i] = Interests.values()[j];
				}
			}
		}
			//Vergleich, ob Array mit eingegebenen Interessen auch die gleiche Länge hat wie das Array mit den möglichen Interessen
			if (result.length < interest.length)
				throw new InvalidInterestsException();
			return result;			
		
	
	}	

}
