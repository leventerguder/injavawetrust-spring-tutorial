package _32.hibernate.declarative.transaction.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import _32.hibernate.declarative.transaction.model.Address;

@Repository
public class AddressDAOImpl implements AddressDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void insertAddress(Address address) {
		Session session = getCurrentSession();
		session.persist(address);
	}
}
