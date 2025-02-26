
/**
 * SNHU
 * CS-320: Software Testing
 * MOD 6: Project One
 * Student name: THOMAS SEIBERT
 * This is the contactServiceTest class.
 * It verifies that the ContactService class meets the requirements through JUnit tests.
 */

package GrandStrandSystems;

// import unit testing
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class contactServiceTest {

	// test to add contact
	@Test
	public void testAddContact() {
		contactService service = new contactService();
		contact contact = new contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
		service.addContact(contact);
		assertEquals(1, service.contacts.size());
	}

	// test to delete contact
	@Test
	public void testDeleteContact() {
		contactService service = new contactService();
		contact contact = new contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
		service.addContact(contact);
		service.deleteContact("1234567890");
		assertEquals(0, service.contacts.size());
	}

	// test to update contact
	@Test
	public void testUpdateContact() {
		contactService service = new contactService();
		contact contact = new contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
		service.addContact(contact);
		service.updateContact("1234567890", "Jane", "Doe", "0987654321", "456 Elm St");
		assertEquals("Jane", service.contacts.get(0).getFirstName());
		assertEquals("0987654321", service.contacts.get(0).getPhone());
	}

}
