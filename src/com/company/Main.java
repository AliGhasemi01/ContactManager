package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = "";
        ContactsManager cm = new ContactsManager();
        while(true)
        {
            System.out.println("enter your command: ");
            command = sc.nextLine();
            switch (command){
                case "list":
                    cm.list();
                    break;
                case "add":
                    cm.addContact();
                    break;
                case "search-by-phone":
                    cm.searchByPhone();
                    break;
                case "search-by-email":
                    cm.searchByEmail();
                    break;
                case "exit":
                    break;
                default :
                    System.out.println("invalid command");
            }
        }
    }
}
