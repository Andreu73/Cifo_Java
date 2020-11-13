package repository;


import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import model.Book;


public class BookRepository {

	private EntityManager entityManager;

	public BookRepository(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public Optional<Book> save(Book book) {
		Optional<Book> resultSave;
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(book);
			entityManager.getTransaction().commit();
			return resultSave = Optional.of(book);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultSave = Optional.empty();
	}
	
	
	public List<Book> findAll() {
		return entityManager.createQuery("from Book").getResultList();
	}

//	public Optional<Book> findById(Integer id) {
//
//		Bird bird = entityManager.find(Book.class, id);
//
//		Optional<Book> resultFind;
//		if (bird != null)
//			resultFind = Optional.of(book);
//		else
//			resultFind = Optional.empty();
//		return resultFind;
//	}


	


	public Optional<Book> findByName(String name) {
		Book book = entityManager.createNamedQuery("Book.findByName", Book.class).setParameter("name", name)
				.getSingleResult();

		Optional<Book> resultFind;
		if (book != null)
			resultFind = Optional.of(book);
		else
			resultFind = Optional.empty();
		return resultFind;
	}
	
	public Optional<Book> deleteByName(String name) {
		Book book = entityManager.createNamedQuery("Book.findByName", Book.class).setParameter("name", name)
				.getSingleResult();

		
		System.out.println(book);
		entityManager.getTransaction().begin();
		entityManager.remove(book);
		entityManager.getTransaction().commit();
				
		Optional<Book> resultDelete;
		if (book != null)
			resultDelete = Optional.of(book);
		else
			resultDelete = Optional.empty();
		return resultDelete;
	}
	


	
}
