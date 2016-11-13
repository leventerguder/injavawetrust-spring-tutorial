package _37.aspectj.transaction.service;

import java.util.List;

import _37.aspectj.transaction.model.Customer;

public interface CustomerService {

	public void insertCustomerData(Customer product);
	public List<Customer> listCustomers();
}
