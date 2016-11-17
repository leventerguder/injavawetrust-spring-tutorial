package _38.aspectj.hibernate.transaction.dao;

import java.util.List;

import _38.aspectj.hibernate.transaction.model.Customer;

public interface CustomerDAO {

	public void insertCustomer(Customer customer);

	public List<Customer> findAllCustomers();

}
