package _30.jdbc.programmatic.transaction.test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _30.jdbc.programmatic.transaction.model.Address;
import _30.jdbc.programmatic.transaction.model.Person;
import _30.jdbc.programmatic.transaction.service.PersonDAOService;

public class JdbcProgrammaticTransactionTest {
	public static void main(String[] args) throws SQLException {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"30.jdbc.programmatic.transaction.xml");

		PersonDAOService pService = ctx.getBean(PersonDAOService.class);

		// create Person object
		Person person = pService.createPerson(1, "Levent", "Erguder", 1989);

		// create Address object
		Address address = pService.createAddress(100, "Java Street", "34000", "Istanbul");

		// setAddress
		person.setAddress(address);

		// insert
		pService.insert(person);

		Person person2 = pService.createPerson(2, "Name", "Surname", 1989);
		Address address2 = pService.createAddress(101, "new street", "throw exception!", "my city");
		person2.setAddress(address2);

		pService.insert(person2);

		((ClassPathXmlApplicationContext) ctx).close();

	}
}
