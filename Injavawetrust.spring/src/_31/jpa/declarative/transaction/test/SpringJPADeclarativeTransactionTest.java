package _31.jpa.declarative.transaction.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import _31.jpa.declarative.transaction.model.Address;
import _31.jpa.declarative.transaction.model.Customer;
import _31.jpa.declarative.transaction.service.CustomerService;
import _31.jpa.declarative.transaction.service.CustomerServiceImpl;

public class SpringJPADeclarativeTransactionTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("31.jpa.declarative.transaction.xml");

		// get ProductService bean
		CustomerService productService = context.getBean(CustomerServiceImpl.class);

		// prepare Customer and Address data.
		Customer customer = new Customer(1, "Levent", "Erguder");
		Address address = new Address(1, "Java Street", "34000", "Istanbul");
		customer.setAddress(address);

		//
		Customer customer2 = new Customer(2, "Orcun", "Erpis");
		Address address2 = new Address(2, "Bakanliklar Street", "06000", "Ankara");
		customer2.setAddress(address2);

		Customer customer3 = new Customer(3, "Hakan", "Gencel");
		// duplicate Address id , throw exception
		// customers3 record will be rollbacked too.
		Address address3 = new Address(2, "Alemdag Road", "34000", "Istanbul");
		customer3.setAddress(address3);

		productService.insertCustomerData(customer);
		productService.insertCustomerData(customer2);

		try {
			productService.insertCustomerData(customer3);
		} catch (Exception e) {
			System.out.println("Rollback...");
			System.out.println(e.getMessage());
		}

		//
		System.out.println("Customer List : ");
		for (Customer customerRecord : productService.listCustomers()) {
			System.out.println(customerRecord);
		}

		context.close();

	}
}
