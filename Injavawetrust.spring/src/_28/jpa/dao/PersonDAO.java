package _28.jpa.dao;

import java.util.List;
import _28.jpa.model.Person;

public interface PersonDAO {

	public void insert(Person person);

	public Person getPersonById(int id);

	public List<Person> getAllPersons();

	public void update(Person person);

	public void delete(int id);

}
