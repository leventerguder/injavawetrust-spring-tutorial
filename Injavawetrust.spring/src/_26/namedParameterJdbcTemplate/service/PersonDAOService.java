package _26.namedParameterJdbcTemplate.service;

import java.util.List;

import _26.namedParameterJdbcTemplate.dao.PersonDAOImpl;
import _26.namedParameterJdbcTemplate.model.Person;

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

	public void update(Person person) {
		personDAOImpl.update(person);
	}

	public void delete(int id) {
		personDAOImpl.delete(id);
	}

	public List<Person> getAllPersons() {
		return personDAOImpl.getAllPersons();
	}

	public Person createPerson(int id, String name, String surname, int birthYear) {
		Person person = new Person(id, name, surname, birthYear);
		return person;
	}
}
