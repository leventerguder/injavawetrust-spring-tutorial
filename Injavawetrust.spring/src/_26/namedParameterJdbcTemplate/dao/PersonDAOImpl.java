package _26.namedParameterJdbcTemplate.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import _26.namedParameterJdbcTemplate.model.Person;

public class PersonDAOImpl implements PersonDAO {

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	private final static String INSERT_PERSON = "insert into person (id, name, surname,birthYear) values (:id , :name , :surname , :birthYear)";
	private final static String SELECT_BYID = "select * from person where id=:id";
	private final static String ALL_SELECT = "select * from person";
	private final static String UPDATE_PERSON = "update person set name=:name , surname=:surname , birthYear=:birthYear where id=:id";
	private final static String DELETE_PERSON = "delete from person where id=:id";
	private final static String DELETE_PERSON_ALL = "delete from person";

	public void setDataSource(DataSource dataSource) {
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);

	}

	@Override
	public void insert(Person person) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", person.getId());
		params.put("name", person.getName());
		params.put("surname", person.getSurname());
		params.put("birthYear", person.getBirthYear());
		namedParameterJdbcTemplate.update(INSERT_PERSON, params);
		// logging
		System.out.println("Person is inserted... " + person);
	}

	@Override
	public Person getPersonById(int id) {

		// Map<String, Object> namedParameters = new HashMap<String, Object>();
		// params.put("id",id);
		// Map de kullanabiliriz.

		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("id", id);
		Person person = namedParameterJdbcTemplate.queryForObject(SELECT_BYID, namedParameters, new PersonRowMapper());
		// logging
		System.out.println("Person is found... " + person);
		return person;
	}

	@Override
	public List<Person> getAllPersons() {
		List<Person> personList = namedParameterJdbcTemplate.query(ALL_SELECT, new PersonRowMapper());
		// logging
		System.out.println("Person list...");
		for (Person person : personList) {
			System.out.println(person);
		}
		return personList;
	}

	@Override
	public void update(Person person) {
		// Map<String, Object> params = new HashMap<String, Object>();
		// params.put("id", person.getId());
		// params.put("name", person.getName());
		// params.put("surname", person.getSurname());
		// params.put("birthYear", person.getBirthYear());

		SqlParameterSource params = new BeanPropertySqlParameterSource(person);
		namedParameterJdbcTemplate.update(UPDATE_PERSON, params);
		// logging
		System.out.println("Person is updated... " + person);

	}

	@Override
	public void delete(int id) {
		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("id", id);
		namedParameterJdbcTemplate.update(DELETE_PERSON, namedParameters);
		// logging
		System.out.println("Person is deleted... Id :" + id);
	}

	@Override
	public void deleteAllPersons() {
		SqlParameterSource namedParameters = new MapSqlParameterSource();
		namedParameterJdbcTemplate.update(DELETE_PERSON_ALL, namedParameters);
		// logging
		System.out.println("All persons are deleted.");
	}

}
