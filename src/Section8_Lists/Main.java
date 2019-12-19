package Section8_Lists;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static MobilePhone iPhone;

    public static void main(String[] args) {

        boolean runProgram = true;
        initializeMobile();

        while (runProgram) {
            informativeOptions();
            int option = sc.nextInt();
            switch (option) {
                case 0: // Quit
                    System.out.println("Turning Off Mobile...");
                    runProgram = false;
                case 1: // List Contacts
                    printContacts();
                    break;
                case 2: // Add Contact
                    addContact();
                    break;
                case 3: // Update Contact
                    updateContact();
                    break;
                case 4: // Remove Contact
                    removeContact();
                    break;
                case 5: // Search Contact
                    searchContact();
                    break;
                default:
                    System.out.println("Invalid Option, select another one");
                    break;
            }
            System.out.println();
        }

    }

    private static void informativeOptions() {
        System.out.println("Welcome to the Mobile use, choose your option:");
        System.out.println("0. Quit");
        System.out.println("1. Print List of Contacts");
        System.out.println("2. Add new contact");
        System.out.println("3. Update existing Contact");
        System.out.println("4. Remove Contact");
        System.out.println("5. Search a Contact");
        System.out.println("Press your key above");
    }

    private static void initializeMobile() {
        String mobileNumber = "659839418";
        iPhone = new MobilePhone(mobileNumber);
        System.out.println("Stating OS... your mobile phone is: " + mobileNumber);
    }

    private static void addContact() {
        System.out.println("Select name of new contact: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Select phone of new contact: ");
        String phone = sc.nextLine();

        iPhone.addContact(Contact.createContact(name, phone));
    }

    private static void printContacts() {
        iPhone.printContacts();
    }

    private static void updateContact() {
        System.out.println("Select name of implied Contact: ");
        sc.nextLine();
        String nameUpdated = sc.nextLine();
        Contact impliedContact = iPhone.queryContact(nameUpdated);
        if (impliedContact == null) {
            System.out.println("Contact not found");
        }

        System.out.println("Select new name: ");
        String newName = sc.nextLine();
        System.out.println("Select new phoneNumber: ");
        String newPhone = sc.nextLine();
        iPhone.updateContact(impliedContact, Contact.createContact(newName, newPhone));
    }

    private static void removeContact() {
        System.out.println("Insert name of implied Contact: ");
        sc.nextLine();
        String deletingName = sc.nextLine();
        Contact removingContact = iPhone.queryContact(deletingName);
        iPhone.removeContact(removingContact);
    }

    private static void searchContact() {
        System.out.println("Insert name of implied Contact: ");
        sc.nextLine();
        String searchingName = sc.nextLine();
        Contact existingContact = iPhone.queryContact(searchingName);

        if (existingContact == null) {
            System.out.println("Contact not found");
        }

        System.out.println("Name: " + existingContact.getName() + " phone number is " + existingContact.getPhone());
    }

}
