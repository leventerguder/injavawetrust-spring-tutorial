package _25.jdbcTemplate.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import _25.jdbcTemplate.model.Person;

public class PersonDAOImpl implements PersonDAO {

	// Watch out for mysql;
	// http://stackoverflow.com/questions/8147447/use-mysql-lower-case-table-names-to-1
	private final static String INSERT_PERSON = "insert into person (id, name, surname,birthYear) values (?, ?, ?,?)";
	private final static String SELECT_BYID = "select * from person where id=?";
	private final static String ALL_SELECT = "select * from person";
	private final static String UPDATE_PERSON = "update person set name=? , surname=? , birthYear=? where id=?";
	private final static String DELETE_PERSON = "delete from person where id=?";
	private final static String DELETE_PERSON_ALL = "delete from person";

	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void insert(Person person) {

		Object[] insertParams = new Object[] { person.getId(), person.getName(), person.getSurname(),
				person.getBirthYear() };
		jdbcTemplate.update(INSERT_PERSON, insertParams);
		// logging
		System.out.println("Person is inserted... " + person);

	}

	@Override
	public Person getPersonById(int id) {
		Object[] selectParams = new Object[] { id };

		Person person = jdbcTemplate.queryForObject(SELECT_BYID, selectParams, new PersonRowMapper());
		// logging
		System.out.println("Person is found... " + person);
		return person;
	}

	@Override
	public List<Person> getAllPersons() {
		List<Person> personList = jdbcTemplate.query(ALL_SELECT, new PersonRowMapper());

		// logging
		System.out.println("Person list...");
		for (Person person : personList) {
			System.out.println(person);
		}

		return personList;
	}

	public void update(Person person) {
		Object[] insertParams = new Object[] { person.getName(), person.getSurname(), person.getBirthYear(),
				person.getId() };
		jdbcTemplate.update(UPDATE_PERSON, insertParams);
		// logging
		System.out.println("Person is updated... " + person);
	}

	@Override
	public void delete(int id) {
		jdbcTemplate.update(DELETE_PERSON, id);
		// logging
		System.out.println("Person is deleted... Id :" + id);
	}

	@Override
	public void deleteAllPersons() {
		jdbcTemplate.update(DELETE_PERSON_ALL);
		//
		System.out.println("All persons are deleted.");
	}

}
