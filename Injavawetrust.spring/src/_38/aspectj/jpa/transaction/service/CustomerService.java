package _38.aspectj.jpa.transaction.service;

import java.util.List;

import _38.aspectj.jpa.transaction.model.Customer;

public interface CustomerService {

	public void insertCustomerData(Customer customer);

	public List<Customer> listCustomers();
}
