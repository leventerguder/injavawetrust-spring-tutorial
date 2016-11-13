package _37.aspectj.transaction.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import _37.aspectj.transaction.model.Address;

@Repository
public class AddressDAOImpl implements AddressDAO{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertAddress(Address address) {
		entityManager.persist(address);
	}
}
