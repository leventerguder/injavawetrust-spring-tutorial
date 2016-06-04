package _26.namedParameterJdbcTemplate.test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _26.namedParameterJdbcTemplate.model.Person;
import _26.namedParameterJdbcTemplate.service.PersonDAOService;

public class NamedParameterJdbcTemplateTest {
	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("26.namedParameterJdbcTemplate.xml");

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

		// getAllPersons
		pService.getAllPersons();

		pService.insert(person2);
		pService.insert(person3);
		((ClassPathXmlApplicationContext) ctx).close();

	}
}
