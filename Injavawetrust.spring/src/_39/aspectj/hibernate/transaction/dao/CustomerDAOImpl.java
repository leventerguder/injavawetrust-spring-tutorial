package _39.aspectj.hibernate.transaction.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import _39.aspectj.hibernate.transaction.model.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	private static final String ALL_CUSTOMERS = "Select c from Customer c";

	@Override
	public void insertCustomer(Customer customer) {
		Session session = getCurrentSession();
		session.persist(customer);
	}

	@Override
	public List<Customer> findAllCustomers() {
		Session session = getCurrentSession();
		TypedQuery<Customer> query = session.createQuery(ALL_CUSTOMERS, Customer.class);
		return query.getResultList();
	}

}
