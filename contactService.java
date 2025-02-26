
/**
 * SNHU
 * CS-320: Software Testing
 * MOD 6: Project One
 * Student name: THOMAS SEIBERT
 * This is the contactService class.
 * It may add, update or delete contacts.
 */

package GrandStrandSystems;

// import array
import java.util.ArrayList;

public class contactService {

	// declare and instantiate array
	ArrayList<contact> contacts = new ArrayList<>();

	// add contact method
	public void addContact(contact contact) {
		for (contact c : contacts) {
			if (c.getContactId().equals(contact.getContactId())) {
				throw new IllegalArgumentException("Contact ID must be unique.");
			}
		}
		contacts.add(contact);
	}

	// delete contact method
	public void deleteContact(String contactId) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getContactId().equals(contactId)) {
				contacts.remove(i);
				return;
			}
		}
		throw new IllegalArgumentException("Contact not found.");
	}

	// update contact method
	public void updateContact(String contactId, String firstName, String lastName, String phone, String address) {
		for (contact c : contacts) {
			if (c.getContactId().equals(contactId)) {
				if (firstName != null)
					c.setFirstName(firstName);
				if (lastName != null)
					c.setLastName(lastName);
				if (phone != null)
					c.setPhone(phone);
				if (address != null)
					c.setAddress(address);
				return;
			}
		}
		throw new IllegalArgumentException("Contact not found.");
	}

}
