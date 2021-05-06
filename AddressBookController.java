package com.addressbook.controller;


import com.addressbok.model.Person;
import com.bl.addressbook.service.AddressBookService;
import com.bl.addressbook.service.IAddressBookService;

import java.util.List;
import java.util.Scanner;

public class AddressBookController {

    private Scanner scanner = new Scanner(System.in);
    private IAddressBookService addressBookService = new AddressBookService();


    public static void main(String[] args) {
        new AddressBookController().userInput();
    }

    public void userInput() {

        while (true) {
            System.out.println(
                    "Select the option to be performed:  " +"/n"+
                            "Enter 1 to ADD the CONTACT, " +
                            "Enter 2 to EDIT," +
                            "Enter 3 to DELETE the CONTACT," +
                            "Enter 4 to Display addressbook" +
                            "Enter 5 to EXIT   ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("enter name -- ");
                    String name = scanner.nextLine();

                    System.out.println("enter age -- ");
                    String age = scanner.nextLine();

                    System.out.println("enter email -- ");
                    String email = scanner.nextLine();
                    
                    System.out.println("enter address -- ");
                    String address = scanner.nextLine();
                    
                    System.out.println("enter phone -- ");
                    String phone = scanner.nextLine();
                    
                    System.out.println("enter zipcode -- ");
                    String zipcode = scanner.nextLine();
                    
                    System.out.println("enter state -- ");
                    String state = scanner.nextLine();
                    
                    System.out.println("enter city -- ");
                    String city = scanner.nextLine();

                    Person person = new Person(name, age, email,address,phone,zipcode,state,city);
                    addressBookService.addPerson(person);
                    break;

                case 3:
                    System.out.println("enter name of person which u want to del -- ");
                    String delName = scanner.nextLine();
                    addressBookService.deletePerson(delName);
                    break;

                case 4:
                    List<Person> addressBook = addressBookService.getAddressBook();
                    addressBook.stream().forEach(System.out::println);
                    break;

                default:
                    System.out.println("Invalid input");
            }
        }
    }
}