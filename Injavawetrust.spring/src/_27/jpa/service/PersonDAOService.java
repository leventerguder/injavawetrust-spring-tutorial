package _27.jpa.service;

import java.util.List;

import _27.jpa.dao.PersonDAOImpl;
import _27.jpa.model.Person;

public class PersonDAOService {

	private PersonDAOImpl personDAOImpl;
	PersonDAOService(PersonDAOImpl personDAOImpl) {
		this.personDAOImpl = personDAOImpl;
	}

	public void insert(Person person) {
		personDAOImpl.insert(person);
	}

	public Person getPersonById(int id) {
		return personDAOImpl.getPersonById(id);
	}

	public List<Person> getAllPersons() {
		return personDAOImpl.getAllPersons();
	}

	public void update(Person person) {
		personDAOImpl.update(person);
	}

	public void delete(int id) {
		personDAOImpl.delete(id);
	}

	public Person createPerson(String name, String surname, int birthYear) {
		Person person = new Person(name, surname, birthYear);
		return person;
	}
}
