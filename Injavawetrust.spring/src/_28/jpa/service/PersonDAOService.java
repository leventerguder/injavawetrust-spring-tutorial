package _28.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import _28.jpa.dao.PersonDAOImpl;
import _28.jpa.model.Person;

@Service("personDAOService")
public class PersonDAOService {

	
	private PersonDAOImpl personDAOImpl;
	
	@Autowired
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
