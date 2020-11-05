package repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import model.Hunter;

public class HunterRepository {

	private EntityManager entityManager;

	public HunterRepository(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public Optional<Hunter> save(Hunter hunter) {
		Optional<Hunter> resultSave;
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(hunter);
			entityManager.getTransaction().commit();
			return resultSave = Optional.of(hunter);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultSave = Optional.empty();
	}

//	public Optional<Hunter> findById(Integer id) {
//
//		Hunter hunter = entityManager.find(Hunter.class, id);
//
//		Optional<Hunter> resultFind;
//		if (hunter != null)
//			resultFind = Optional.of(hunter);
//		else
//			resultFind = Optional.empty();
//		return resultFind;
//	}
//
//	public List<Hunter> findAll() {
//		return entityManager.createQuery("from Hunter").getResultList();
//	}
//
//	public Optional<Hunter> findByName(String name) {
//		Hunter hunter = entityManager.createNamedQuery("Author.findByName", Hunter.class).setParameter("name", name)
//				.getSingleResult();
//
//		Optional<Hunter> resultFind;
//		if (hunter != null)
//			resultFind = Optional.of(hunter);
//		else
//			resultFind = Optional.empty();
//		return resultFind;
//	}
//
//	public Optional<Hunter> deleteByName(String name) {
//		Hunter hunter = entityManager.createNamedQuery("Author.findByName", Hunter.class).setParameter("name", name)
//				.getSingleResult();
//
//		
//		System.out.println(hunter);
//		entityManager.getTransaction().begin();
//		entityManager.remove(hunter);
//		entityManager.getTransaction().commit();
//		
//		
//		
//		Optional<Hunter> resultDelete;
//		if (hunter != null)
//			resultDelete = Optional.of(hunter);
//		else
//			resultDelete = Optional.empty();
//		return resultDelete;
//	}



	}
