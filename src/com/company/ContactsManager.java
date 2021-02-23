package com.company;

import java.util.Scanner;

class ContactsManager {
    Contact[] contacts;
    int count;

    ContactsManager(){
        contacts = new Contact[100];
        count = 0;
    }

    void displayContact(Contact contact){
        System.out.println("id: " + contact.id);
        System.out.println("first name: " + contact.first_name);
        System.out.println("last name: " + contact.last_name);
        System.out.println("first name: " + contact.phone_number);
        System.out.println("email: " + contact.email);
        System.out.println("birthdate: " + contact.birthdate);
        System.out.println("####");
    }

    void list(){
        for(int i = 0; i < count; i++){
            displayContact(contacts[i]);
        }
    }

    void addContact(){
        Contact c = new Contact();
        Scanner sc = new Scanner (System.in);
        System.out.print("first name: ");
        c.first_name = sc.nextLine();
        System.out.print("last name: ");
        c.last_name = sc.nextLine();
        System.out.print("email: ");
        c.email = sc.nextLine();
        System.out.print("phone number: ");
        c.phone_number = sc.nextLine();
        System.out.print("birthdate: ");
        c.birthdate = sc.nextLine();
        c.id = count;
        contacts[count] = c;
        count++;
        System.out.println("Done! \n ####");
    }

    void searchByEmail(){
        System.out.print("Enter email: ");
        Scanner sc = new Scanner (System.in);
        String email = sc.nextLine();
        boolean b = false;
        for(int i = 0; i < count; i++){
            if(contacts[i].email.equals(email)){
                displayContact(contacts[i]);
                b = true;
            }
        }
        if(b == false){
            System.out.print("no contacts found \n ####");
        }
    }

    void searchByPhone(){
        System.out.print("Enter phone number: ");
        Scanner sc = new Scanner (System.in);
        String phone = sc.nextLine();
        boolean b = false;
        for(int i = 0; i < count; i++){
            if(contacts[i].phone_number.equals(phone)){
                displayContact(contacts[i]);
                b = true;
            }
        }
        if(b == false){
            System.out.println("no contacts found \n ####");
        }
    }
}