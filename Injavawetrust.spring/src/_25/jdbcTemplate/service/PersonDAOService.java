package _25.jdbcTemplate.service;

import java.util.List;
import _25.jdbcTemplate.dao.PersonDAOImpl;
import _25.jdbcTemplate.model.Person;

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

	public Person createPerson(int id, String name, String surname, int birthYear) {
		Person person = new Person(id, name, surname, birthYear);
		return person;
	}
}
