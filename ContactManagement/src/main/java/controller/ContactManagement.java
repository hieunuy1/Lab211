/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Contact;
import view.Validation;
import view.Menu;
/**
 *
 * @author tung
 */
public class ContactManagement extends Menu<String> {
    private ArrayList<Contact> contacts;
    private Validation validation;

    public ContactManagement() {
        title = "Contact Management System";
        String[] options = {"Add Contact", "Display Contacts", "Delete Contact", "Exit"};
        super.mChon = new ArrayList<>();
        for (String option : options) {
            super.mChon.add(option);
        }
        contacts = new ArrayList<>();
        validation = new Validation();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                addContact();
                break;
            case 2:
                displayContacts();
                break;
            case 3:
                deleteContact();
                break;
            case 4:
                System.out.println("Exiting program...");
                System.exit(0);
                break;
        }
    }

    private void addContact() {
        System.out.println("Adding a new contact:");
        int contactId = contacts.size() + 1;
        System.out.print("Enter full name: ");
        String fullname = validation.checkInputString();
        System.out.print("Enter group: ");
        String group = validation.checkInputString();
        System.out.print("Enter address: ");
        String address = validation.checkInputString();
        System.out.print("Enter phone number: ");
        String phone = validation.checkInputPhone();
        Contact newContact = new Contact(contactId, fullname, group, address, phone, "", "");
        contacts.add(newContact);
        System.out.println("Contact added successfully!");
    }

    private void displayContacts() {
        System.out.println("Displaying all contacts:");
        for (Contact contact : contacts) {
            System.out.println(contact.getContactId() + ". " + contact.getFullname() + ", Group: " + contact.getGroup() +
                    ", Address: " + contact.getAddress() + ", Phone: " + contact.getPhone());
        }
    }

    private void deleteContact() {
        System.out.println("Deleting a contact:");
        System.out.print("Enter contact ID to delete: ");
        int contactId = validation.checkInputInt();
        boolean found = false;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getContactId() == contactId) {
                contacts.remove(i);
                found = true;
                System.out.println("Contact with ID " + contactId + " deleted successfully!");
                break;
            }
        }
        if (!found) {
            System.out.println("Contact with ID " + contactId + " not found.");
        }
    }
}