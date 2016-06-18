package _31.jpa.declarative.transaction.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import _31.jpa.declarative.transaction.model.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@PersistenceContext
	private EntityManager entityManager;

	private static final String ALL_CUSTOMERS = "Select c from Customer c";

	@Override
	public void insertCustomer(Customer product) {		
		entityManager.persist(product);		
	}

	@Override
	public List<Customer> findAllCustomers() {

		TypedQuery<Customer> query = entityManager.createQuery(ALL_CUSTOMERS, Customer.class);
		return query.getResultList();

	}

}
