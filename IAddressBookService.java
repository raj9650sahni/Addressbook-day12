package com.bl.addressbook.service;

import java.util.List;
import java.util.Scanner;

import com.addressbok.model.Person;

public interface IAddressBookService {

	public boolean addPerson(Person person);

	public boolean deletePerson(String name);

	List<Person> getAddressBook();

	public boolean editPerson(String contactName, Scanner scanner);

	public boolean hasPresent(String p);
	
	public void showByState(String s);
	
	public void showByCity(String c);
	
	public int count();
	
	

}
