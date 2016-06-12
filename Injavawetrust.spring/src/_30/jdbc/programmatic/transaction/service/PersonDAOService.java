package _30.jdbc.programmatic.transaction.service;

import _30.jdbc.programmatic.transaction.dao.PersonDAOImpl;
import _30.jdbc.programmatic.transaction.model.Address;
import _30.jdbc.programmatic.transaction.model.Person;

public class PersonDAOService {

	private PersonDAOImpl personDAOImpl;

	PersonDAOService(PersonDAOImpl personDAOImpl) {
		this.personDAOImpl = personDAOImpl;
	}

	public void insert(Person person) {
		personDAOImpl.insert(person);
	}

	public Person createPerson(int id, String name, String surname, int birthYear) {
		Person person = new Person(id, name, surname, birthYear);
		return person;
	}

	public Address createAddress(int addressId, String street, String zipcode, String city) {
		Address address = new Address(addressId, street, zipcode, city);
		return address;
	}
}
