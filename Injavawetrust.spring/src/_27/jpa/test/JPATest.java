package _27.jpa.test;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _27.jpa.model.Person;
import _27.jpa.dao.PersonDAO;
import _27.jpa.dao.PersonDAOImpl;

public class JPATest {
	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("27.jpa.xml");

		PersonDAO personDAO = ctx.getBean(PersonDAOImpl.class);

		// create person object
		Person person1 = new Person("oldName", "oldSurname", 1989);

		// insert
		personDAO.insert(person1);

		// find
		Person foundPerson = personDAO.getPersonById(1);
		System.out.println("Found ... " + foundPerson);

		// update
		person1.setName("Levent");
		person1.setSurname("Erguder");
		personDAO.update(person1);
		System.out.println("After Update...");

		// find
		foundPerson = personDAO.getPersonById(1);
		System.out.println("Found ... " + foundPerson);

		Person person2 = new Person("James", "Gosling", 1955);
		Person person3 = new Person("Joshua", "Bloch", 1961);

		personDAO.insert(person2);
		personDAO.insert(person3);

		// delete
		personDAO.delete(1);

		// list
		List<Person> personList = personDAO.getAllPersons();
		System.out.println("Listing...");
		for (Person p : personList) {
			System.out.println(p);
		}

		((ClassPathXmlApplicationContext) ctx).close();

	}
}
