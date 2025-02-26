
/**
 * SNHU
 * CS-320: Software Testing
 * MOD 6: Project One
 * Student name: THOMAS SEIBERT
 * This is the contact class.
 * It stores contact information.
 */

package GrandStrandSystems;

public class contact {

	// declare variables
	private final String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;

	// constructor
	public contact(String contactId, String firstName, String lastName, String phone, String address) {
		if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Contact ID must be non-null and up to 10 characters.");
		}
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("First name must be non-null and up to 10 characters.");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Last name must be non-null and up to 10 characters.");
		}
		if (phone == null || phone.length() != 10 || !phone.matches("\\d{10}")) {
			throw new IllegalArgumentException("Phone must be exactly 10 digits.");
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Address must be non-null and up to 30 characters.");
		}

		// instantiate
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}

	// get contact ID
	public String getContactId() {
		return contactId;
	}

	// get first name
	public String getFirstName() {
		return firstName;
	}

	// get last name
	public String getLastName() {
		return lastName;
	}

	// get phone number
	public String getPhone() {
		return phone;
	}

	// get address
	public String getAddress() {
		return address;
	}

	// set first name
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("First name can't be null and must be up to 10 characters.");
		}
		this.firstName = firstName;
	}

	// set last name
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Last name can't be null and must be up to 10 characters.");
		}
		this.lastName = lastName;
	}

	// set phone number
	public void setPhone(String phone) {
		if (phone == null || phone.length() != 10 || !phone.matches("\\d{10}")) {
			throw new IllegalArgumentException("Phone number must be 10 digits.");
		}
		this.phone = phone;
	}

	// set address
	public void setAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Address can't be null and must be up to 30 characters.");
		}
		this.address = address;
	}

}
