package _24.jdbc.service;

import java.util.List;
import _24.jdbc.dao.PersonDAOImpl;
import _24.jdbc.model.Person;

public class PersonDAOService {

	private PersonDAOImpl personDAOImpl;
	PersonDAOService(PersonDAOImpl personDAOImpl) {
		this.personDAOImpl = personDAOImpl;
	}

	public void insert(Person person) {
		personDAOImpl.insert(person);
	}

	public Person getPersonById(int id) {
		Person person = personDAOImpl.getPersonById(id);
		return person;
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

	public Person createPerson(int id, String name, String surname, int birthYear) {
		Person person = new Person(id, name, surname, birthYear);
		return person;
	}

}
