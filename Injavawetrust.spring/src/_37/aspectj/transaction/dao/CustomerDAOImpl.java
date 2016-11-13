package _37.aspectj.transaction.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import _37.aspectj.transaction.model.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

	@PersistenceContext
	private EntityManager entityManager;

	private static final String ALL_CUSTOMERS = "Select c from Customer c";

	public void insertCustomer(Customer product) {
		entityManager.persist(product);
	}

	public List<Customer> findAllCustomers() {
		TypedQuery<Customer> query = entityManager.createQuery(ALL_CUSTOMERS, Customer.class);
		return query.getResultList();
	}

}
