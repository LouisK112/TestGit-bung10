package database;

/**
 * 
 * @author Louis
 * Hier werden Kunden erstellt
 */
public class Customer {

	private String firstName;
	private String lastName;
	private String emailAddress;
	private Interests [] interests;
	
	/**
	 * Konstruktor um Kunden zu erstellen
	 * @param firstName Vorname des Kunden
	 * @param lastName Nachname des Kunden
	 * @param emailAddress Email-Addresse des Kunden
	 * @param interests Persönliche Interessen des Junden
	 */
	public Customer(String firstName, String lastName, String emailAddress, Interests [] interests) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.interests = interests;
		
	}

	/**
	 * Getter des Vornamens
	 * @return Vorname
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Setter des Vornamens 
	 * @return void 
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Getter des Nachnamens
	 * @return Nachname
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Setter des Nachnamens 
	 * @return void 
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Getter der E-Mail-Addresse
	 * @return E-Mail-Addresse
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * Setter der E-Mail-Addresse 
	 * @return void 
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * Getter der Interessen
	 * @return Interessen
	 */
	public Interests[] getInterests() {
		return interests;
	}

	/**
	 * Setter der Interessen 
	 * @return void 
	 */
	public void setInterests(Interests[] interests) {
		this.interests = interests;
	}

}
