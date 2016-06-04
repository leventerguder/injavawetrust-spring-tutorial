package _26.namedParameterJdbcTemplate.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import _26.namedParameterJdbcTemplate.model.Person;

public class PersonRowMapper implements RowMapper<Person> {

	@Override
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		Person person = new Person();
		person.setId(rs.getInt("id"));
		person.setName(rs.getString("name"));
		person.setSurname(rs.getString("surname"));
		person.setBirthYear(rs.getInt("birthYear"));
		return person;
	}

}
