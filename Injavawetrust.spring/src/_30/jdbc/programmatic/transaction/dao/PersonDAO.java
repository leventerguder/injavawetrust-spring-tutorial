package _30.jdbc.programmatic.transaction.dao;

import _30.jdbc.programmatic.transaction.model.Address;
import _30.jdbc.programmatic.transaction.model.Person;

public interface PersonDAO {

	public void insert(Person person);

	public void insertAddress(Address address);

	public void updatePersonAddress(int id, int addressId);
}
