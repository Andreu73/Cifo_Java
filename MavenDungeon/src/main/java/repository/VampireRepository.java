package repository;

import java.util.Optional;

import javax.persistence.EntityManager;

import model.Hunter;
import model.Vampire;

public class VampireRepository {

	private EntityManager entityManager;

	public VampireRepository(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public Optional<Vampire> save(Vampire vampire) {
		Optional<Vampire> resultSave;
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(vampire);
			entityManager.getTransaction().commit();
			return resultSave = Optional.of(vampire);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultSave = Optional.empty();
	}

}
