package _30.jdbc.programmatic.transaction.test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _30.jdbc.programmatic.transaction.dao.PersonDAO;
import _30.jdbc.programmatic.transaction.dao.PersonDAOImpl;
import _30.jdbc.programmatic.transaction.model.Address;
import _30.jdbc.programmatic.transaction.model.Person;

public class JdbcProgrammaticTransactionTest {
	public static void main(String[] args) throws SQLException {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("30.jdbc.programmatic.transaction.xml");

		PersonDAO personDAO = ctx.getBean(PersonDAOImpl.class);

		// create Person object
		Person person = new Person(1, "Levent", "Erguder", 1989);

		// create Address object
		Address address = new Address(100, "Java Street", "34000", "Istanbul");

		// setAddress
		person.setAddress(address);

		// insert
		personDAO.insert(person);

		Person person2 = new Person(2, "Name", "Surname", 1989);
		Address address2 = new Address(101, "new street", "throw exception!", "my city");
		person2.setAddress(address2);

		personDAO.insert(person2);

		((ClassPathXmlApplicationContext) ctx).close();

	}
}
