package _25.jdbcTemplate.test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _25.jdbcTemplate.dao.PersonDAO;
import _25.jdbcTemplate.model.Person;

public class JdbcTemplateTest {

	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("25.jdbcTemplate.xml");

		PersonDAO personDAO = ctx.getBean(PersonDAO.class);

		// create person object
		Person person = new Person(1, "Lvnt", "Erguder", 1989);

		// insert
		personDAO.insert(person);

		// find
		personDAO.getPersonById(1);

		// update
		person.setName("Levent");
		personDAO.update(person);

		// delete
		personDAO.delete(1);

		Person person2 = new Person(12, "James", "Gosling", 1955);
		Person person3 = new Person(13, "Joshua", "Bloch", 1961);

		personDAO.insert(person2);
		personDAO.insert(person3);

		// getAllPersons
		personDAO.getAllPersons();

		// deleteAllPersons
		personDAO.deleteAllPersons();
		((ClassPathXmlApplicationContext) ctx).close();

	}
}
