package _31.jpa.declarative.transaction.service;

import java.util.List;

import _31.jpa.declarative.transaction.model.Customer;

public interface CustomerService {
	
	public void insertCustomerData(Customer product);

	public List<Customer> listCustomers();
}
