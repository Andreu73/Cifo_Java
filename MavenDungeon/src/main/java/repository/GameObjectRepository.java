package repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import model.GameObject;
import model.Hunter;

public class GameObjectRepository {
	
	private EntityManager entityManager;

	public GameObjectRepository(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	
	public Optional<GameObject> findByWidth(String name) {
		GameObject go = entityManager.createNamedQuery("GameObject.findByWidth", GameObject.class).setParameter("name", name)
				.getSingleResult();

		Optional<GameObject> resultFind;
		if (go != null)
			resultFind = Optional.of(go);
		else
			resultFind = Optional.empty();
		return resultFind;
	}

//	public Optional<GameObject> findAllGOsXY(GameObjectRepository gameObjectRepository){
//		
//	List<GameObject> gos = gameObjectRepository.findAll();
//	System.out.println("GOs:");
//	for (GameObject goToPrint : gos) {
//		System.out.println(goToPrint);
//	}
//	gos.forEach(System.out::println);
//	}
	

	
}
