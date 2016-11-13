package _31.jpa.declarative.transaction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import _31.jpa.declarative.transaction.dao.AddressDAO;
import _31.jpa.declarative.transaction.dao.CustomerDAO;
import _31.jpa.declarative.transaction.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;

	@Autowired
	private AddressDAO addressDao;

	@Transactional
	@Override
	public void insertCustomerData(Customer customer) {
		customerDAO.insertCustomer(customer);
		addressDao.insertAddress(customer.getAddress());
	}

	@Transactional(readOnly = true)
	@Override
	public List<Customer> listCustomers() {
		return customerDAO.findAllCustomers();

	}

}
