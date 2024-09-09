package contactmanager;
import java.util.*;

public class ContactManagementApp {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();

        // Adding contacts
        manager.addContact(new Contact("Alice", "1234567890", "alice@example.com"));
        manager.addContact(new Contact("Bob", "0987654321", "bob@example.com"));
        manager.addContact(new Contact("Charlie", "1122334455", "charlie@example.com"));

        // Attempt to add a duplicate contact
        boolean added = manager.addContact(new Contact("Alice", "1234567890", "alice_new@example.com"));
        System.out.println("Was the duplicate contact added? " + added);

        // Retrieve a contact
        Contact contact = manager.getContact("1234567890");
        System.out.println("Retrieved Contact: " + contact);

        // Remove a contact
        boolean removed = manager.removeContact("0987654321");
        System.out.println("Was the contact removed? " + removed);

        // Display all contacts
        Set<Contact> allContacts = manager.getAllContacts();
        System.out.println("All Contacts:");
        for (Contact c : allContacts) {
            System.out.println(c);
        }
    }
}