package _32.hibernate.declarative.transaction.dao;

import java.util.List;

import _32.hibernate.declarative.transaction.model.Customer;

public interface CustomerDAO {

	public void insertCustomer(Customer customer);

	public List<Customer> findAllCustomers();

}
