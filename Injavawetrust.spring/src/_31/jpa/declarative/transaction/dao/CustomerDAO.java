package _31.jpa.declarative.transaction.dao;

import java.util.List;

import _31.jpa.declarative.transaction.model.Customer;

public interface CustomerDAO {

	public void insertCustomer(Customer product);

	public List<Customer> findAllCustomers();
}
