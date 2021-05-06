package com.bl.addressbook.service;

import com.addressbok.model.Person;
import com.bl.addressbook.service.IAddressBookService;

import java.util.List;
import java.util.ArrayList;

public class AddressBookService implements IAddressBookService {
	private List<Person>  addressBookList;

	public AddressBookService() {
		addressBookList = new ArrayList<>();
	}

	@Override
	public boolean addPerson(Person person) {
		return addressBookList.add(person);
	}

	@Override
	public boolean deletePerson(String name) {
		for (int i = 0; i < addressBookList.size(); i++) {
			if (addressBookList.get(i).name.equalsIgnoreCase(name)) {
				addressBookList.remove(i);
				return true;
			}
		}

		return false;
	}

	@Override
	public List<Person> getAddressBook() {
		return addressBookList;
	}

}
