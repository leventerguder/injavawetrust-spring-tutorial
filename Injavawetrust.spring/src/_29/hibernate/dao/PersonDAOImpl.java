package _29.hibernate.dao;

import java.util.List;

import javax.persistence.TypedQuery;

//import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import _29.hibernate.model.Person;

@Repository("personDAOImpl")
public class PersonDAOImpl implements PersonDAO {

	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.openSession();
	}

	@Override
	public void insert(Person person) {
		Session session = getSession();
		Transaction transacion = session.beginTransaction();
		session.persist(person);
		transacion.commit();
		session.close();
	}

	@Override
	public Person getPersonById(int id) {
		Session session = getSession();
		Person person = session.get(Person.class, id);
		session.close();
		return person;

	}

	@Override
	public List<Person> getAllPersons() {
		Session session = getSession();
		TypedQuery<Person> query = session.createQuery("Select e from Person e",Person.class);
		
		//org.hibernate.Query is deprecated
		//Query query = session.createQuery("Select e from Person e");
		//return query.list()
		return query.getResultList();
		/*
		 * @Deprecated
			@SuppressWarnings("UnusedDeclaration")
			public interface Query<R> extends TypedQuery<R>, CommonQueryContract {
			..
			}
		 */

	}

	@Override
	public void update(Person person) {
		Session session = getSession();
		Transaction transacion = session.beginTransaction();
		session.update(person);
		transacion.commit();
		session.close();
	}

	@Override
	public void delete(int id) {
		Person person = getPersonById(id);
		if (person != null) {
			Session session = getSession();
			Transaction transacion = session.beginTransaction();
			session.delete(person);
			transacion.commit();
			session.close();
		}

	}

}
