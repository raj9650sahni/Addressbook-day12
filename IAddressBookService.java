package com.bl.addressbook.service;
import java.util.List;

import com.addressbok.model.Person;

public interface IAddressBookService {

	public boolean addPerson(Person person);
	public boolean deletePerson(String name);
	List<Person> getAddressBook();
	
	

}
