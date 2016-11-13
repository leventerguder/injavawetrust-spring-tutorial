package _37.aspectj.transaction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import _37.aspectj.transaction.dao.AddressDAO;
import _37.aspectj.transaction.dao.CustomerDAO;
import _37.aspectj.transaction.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDAO productDao;

	@Autowired
	private AddressDAO addressDao;

	//@Override
	public void insertCustomerData(Customer product) {
		productDao.insertCustomer(product);
		addressDao.insertAddress(product.getAddress());
	}

	//@Override
	public List<Customer> listCustomers() {
		return productDao.findAllCustomers();

	}

}
