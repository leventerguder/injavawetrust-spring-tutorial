package _24.jdbc.test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _24.jdbc.model.Person;
import _24.jdbc.service.PersonDAOService;

public class SpringJDBCTest {

	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("24.spring.jdbc.xml");

		PersonDAOService pService = ctx.getBean(PersonDAOService.class);

		// create person object
		Person person = pService.createPerson(1, "Lvnt", "Erguder", 1989);

		// insert
		pService.insert(person);

		// find
		pService.getPersonById(1);

		// update
		person.setName("Levent");
		pService.update(person);

		// delete
		pService.delete(1);

		Person person2 = pService.createPerson(2, "James", "Gosling", 1955);
		Person person3 = pService.createPerson(3, "Joshua", "Bloch", 1961);

		pService.insert(person2);
		pService.insert(person3);

		// getAllPersons
		pService.getAllPersons();

		((ClassPathXmlApplicationContext) ctx).close();

	}
}
