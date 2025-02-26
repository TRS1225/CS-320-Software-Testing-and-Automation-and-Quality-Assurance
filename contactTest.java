
/**
 * SNHU
 * CS-320: Software Testing
 * MOD 6: Project One
 * Student name: THOMAS SEIBERT
 * This is the contactTest class.
 * It verifies that the contact class meets the requirements through JUnit tests.
 */

package GrandStrandSystems;

// import tests
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class contactTest {

	// tests whether or not the creation of a contact is valid
	@Test
	public void testValidContactCreation() {
		contact contact = new contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
		assertEquals("John", contact.getFirstName());
		assertEquals("Doe", contact.getLastName());
		assertEquals("1234567890", contact.getPhone());
		assertEquals("123 Main St", contact.getAddress());
	}

	// tests whether or not the contact ID is valid
	@Test
	public void testInvalidContactId() {
		assertThrows(IllegalArgumentException.class,
				() -> new contact(null, "John", "Doe", "1234567890", "123 Main St"));
	}

	// tests whether or not the first name is valid
	@Test
	public void testInvalidFirstName() {
		assertThrows(IllegalArgumentException.class,
				() -> new contact("1234567890", null, "Doe", "1234567890", "123 Main St"));
	}

	// tests whether or not the last name is valid
	@Test
	public void testInvalidLastName() {
		assertThrows(IllegalArgumentException.class,
				() -> new contact("1234567890", "John", null, "1234567890", "123 Main St"));
	}

	// tests whether or not the phone number is valid
	@Test
	public void testInvalidPhone() {
		assertThrows(IllegalArgumentException.class,
				() -> new contact("1234567890", "John", "Doe", "12345", "123 Main St"));
	}

	// tests whether or not the address is valid
	@Test
	public void testInvalidAddress() {
		assertThrows(IllegalArgumentException.class,
				() -> new contact("1234567890", "John", "Doe", "1234567890", null));
	}

}
