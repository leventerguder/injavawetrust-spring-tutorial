package _24.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import _24.jdbc.model.Person;

public class PersonDAOImpl implements PersonDAO {

	//Watch out for mysql;
	//http://stackoverflow.com/questions/8147447/use-mysql-lower-case-table-names-to-1
	private final static String INSERT_PERSON = "insert into person (id, name, surname,birthYear) values (?, ?, ?,?)";
	private final static String SELECT_BYID = "select * from person where id=?";
	private final static String ALL_SELECT = "select * from person";
	private final static String UPDATE_PERSON = "update person set name=? , surname=? , birthYear=? where id=?";
	private final static String DELETE_PERSON = "delete from person where id=?";
	private final static String DELETE_PERSON_ALL = "delete from person";

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void insert(Person person) {

		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PERSON);
			preparedStatement.setInt(1, person.getId());
			preparedStatement.setString(2, person.getName());
			preparedStatement.setString(3, person.getSurname());
			preparedStatement.setInt(4, person.getBirthYear());
			preparedStatement.executeUpdate();
			preparedStatement.close();

			// logging
			System.out.println("Person is inserted..." + person);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Person getPersonById(int id) {
		Person person = null;
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BYID);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				String name = resultSet.getString("name");
				String surname = resultSet.getString("surname");
				int birthYear = resultSet.getInt("birthYear");
				person = new Person(id, name, surname, birthYear);

				// logging
				System.out.println("Person is found..." + person);
			}
			resultSet.close();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return person;

	}

	@Override
	public List<Person> getAllPersons() {

		List<Person> personList = new ArrayList<Person>();
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(ALL_SELECT);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String surname = resultSet.getString("surname");
				int birthYear = resultSet.getInt("birthYear");
				Person person = new Person(id, name, surname, birthYear);
				personList.add(person);
			}
			// logging
			System.out.println("Person list...");
			for (Person person : personList) {
				System.out.println(person);
			}
			resultSet.close();
			preparedStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return personList;

	}

	@Override
	public void update(Person person) {

		try {

			Connection connection = dataSource.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PERSON);
			preparedStatement.setString(1, person.getName());
			preparedStatement.setString(2, person.getSurname());
			preparedStatement.setInt(3, person.getBirthYear());
			preparedStatement.setInt(4, person.getId());
			preparedStatement.executeUpdate();
			preparedStatement.close();

			// logging
			System.out.println("Person is updated..." + person);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(int id) {

		try {

			Connection connection = dataSource.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PERSON);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
			preparedStatement.close();

			// logging
			System.out.println("Person is deleted... Id : " + id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteAllPersons() {
		try {

			Connection connection = dataSource.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PERSON_ALL);
			preparedStatement.executeUpdate();
			preparedStatement.close();

			// logging
			System.out.println("All Persons are deleted...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
