package app;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.GameObject;
import model.Hunter;
import model.Vampire;
import repository.HunterRepository;
import repository.VampireRepository;

public class Main2 {
	
	public final static int WIDTH = 15;
	public final static int HEIGHT = 10;
	public final static int VAMPIRES = 2;
	public final static int HUNTERS = 1;
	public final static int STAKES = 1;
	public final static int WALLS = 1;
	
	public static boolean isFinished = false;
	
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dungeon");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		VampireRepository vampireRepository = new VampireRepository(entityManager);
		HunterRepository hunterRepository = new HunterRepository(entityManager);

		Vampire vampire1 = new Vampire("V", 5);	
		Vampire vampire2 = new Vampire("V", 5);
		Vampire vampire3 = new Vampire("V", 5);
		
		Optional<Vampire> savedVampire1 = vampireRepository.save(vampire1);
		Optional<Vampire> savedVampire2 = vampireRepository.save(vampire2);
		Optional<Vampire> savedVampire3 = vampireRepository.save(vampire3);
		System.out.println("Saved vampire: " + savedVampire1.get());
		System.out.println("Saved vampire: " + savedVampire2.get());
		System.out.println("Saved vampire: " + savedVampire3.get());
		
		Hunter hunter1 = new Hunter("E", "Mary");
		Optional<Hunter> savedHunter1 = hunterRepository.save(hunter1);
		System.out.println("Saved hunter: " + savedHunter1.get());
//		hunterRepository.findAllGOsXY();
	
		
//		List<Hunter> hunters = hunterRepository.findAll();
//		System.out.println("Authors:");
//		for (Hunter authorToPrint : hunters) {
//			System.out.println(authorToPrint);
//		}
//		hunters.forEach(System.out::println);
		
//
//
//		Optional<Hunter> hunterByName = hunterRepository.findByName("Andreu");
//		System.out.println("Searching for an author by name: ");
//		hunterByName.ifPresent(System.out::println);
//		hunterByName = hunterRepository.deleteByName("Leon Tolstoi");
//		hunterByName.ifPresent(System.out::println);

		
		entityManager.close();
		entityManagerFactory.close();
		

		
	}

}
