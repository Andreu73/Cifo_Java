package repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import model.Quote;


public class QuoteRepository {
	
	private EntityManager entityManager;

	public QuoteRepository(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


public Optional<Quote> save(Quote person) {
	
	try {
		entityManager.getTransaction().begin();
		entityManager.persist(person);
		entityManager.getTransaction().commit();
		return Optional.of(person);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return Optional.empty();
}

public List<Quote> findAll() {
	return entityManager.createQuery("from Quote").getResultList();
}
	
	
}
