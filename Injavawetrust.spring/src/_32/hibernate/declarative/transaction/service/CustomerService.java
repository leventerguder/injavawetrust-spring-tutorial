package _32.hibernate.declarative.transaction.service;

import java.util.List;

import _32.hibernate.declarative.transaction.model.Customer;


public interface CustomerService {

	public void insertCustomerData(Customer customer);

	public List<Customer> listCustomers();
}
