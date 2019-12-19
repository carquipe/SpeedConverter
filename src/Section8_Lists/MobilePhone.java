package Section8_Lists;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println(contact.getName() + " already exists.");
            return false;
        }

        myContacts.add(contact);
        System.out.println("Added contact " + contact.getName());
        return true;
    }

    public boolean updateContact(Contact currentContact, Contact newContact) {
        int index = findContact(currentContact);
        if (index < 0) {
            System.out.println("Contact " + currentContact.getName() + " doesn't exist.");
            return false;
        } else if (findContact(newContact) >= 0) {
            System.out.println("The contact you want to insert already exists");
            return false;
        }

        myContacts.set(index, newContact);
        System.out.println("Updated Contact " + currentContact.getName() + " to " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int index = findContact(contact);
        if (index < 0) {
            System.out.println("Item not available in file");
            return false;
        }

        myContacts.remove(index);
        System.out.println("Removed " + contact.getName());
        return true;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int index = findContact(name);
        if (index >= 0) {
            return myContacts.get(index);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List");
        myContacts.forEach((c) -> System.out.println(c.toString()));
    }
}
