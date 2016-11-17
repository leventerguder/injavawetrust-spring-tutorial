package _37.aspectj.jpa.transaction.dao;

import java.util.List;

import _37.aspectj.jpa.transaction.model.Customer;

public interface CustomerDAO {

	public void insertCustomer(Customer customer);

	public List<Customer> findAllCustomers();

}
