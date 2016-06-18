package _31.jpa.declarative.transaction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import _31.jpa.declarative.transaction.dao.AddressDAOImpl;
import _31.jpa.declarative.transaction.dao.CustomerDAOImpl;
import _31.jpa.declarative.transaction.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAOImpl productDao;

	@Autowired
	private AddressDAOImpl addressDao;

	@Transactional
	@Override
	public void insertCustomerData(Customer product) {
		productDao.insertCustomer(product);
		addressDao.insertAddress(product.getAddress());
	}

	@Transactional(readOnly = true)
	@Override
	public List<Customer> listCustomers() {
		return productDao.findAllCustomers();

	}

}
