package _37.aspectj.transaction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import _37.aspectj.transaction.dao.AddressDAO;
import _37.aspectj.transaction.dao.AddressDAOImpl;
import _37.aspectj.transaction.dao.CustomerDAO;
import _37.aspectj.transaction.dao.CustomerDAOImpl;
import _37.aspectj.transaction.model.Customer;

@Repository
public class CustomerServiceImpl {

	@Autowired
	private CustomerDAO productDao;

	@Autowired
	private AddressDAO addressDao;


	public void insertCustomerData(Customer product) {
		productDao.insertCustomer(product);
		addressDao.insertAddress(product.getAddress());
	}

	
	public List<Customer> listCustomers() {
		return productDao.findAllCustomers();

	}

}
