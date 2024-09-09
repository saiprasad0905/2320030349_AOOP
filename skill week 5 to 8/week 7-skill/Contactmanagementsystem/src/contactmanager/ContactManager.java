package contactmanager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


class ContactManager {
    private Set<Contact> contactSet;
    private Map<String, Contact> contactMap;

    public ContactManager() {
        contactSet = new HashSet<>();
        contactMap = new HashMap<>();
    }

    public boolean addContact(Contact contact) {
        if (contactSet.add(contact)) {
            contactMap.put(contact.getPhoneNumber(), contact);
            return true;
        }
        return false;
    }

    public boolean removeContact(String phoneNumber) {
        Contact contact = contactMap.get(phoneNumber);
        if (contact != null) {
            contactSet.remove(contact);
            contactMap.remove(phoneNumber);
            return true;
        }
        return false;
    }

    public Contact getContact(String phoneNumber) {
        return contactMap.get(phoneNumber);
    }

    public Set<Contact> getAllContacts() {
        return contactSet;
    }
}