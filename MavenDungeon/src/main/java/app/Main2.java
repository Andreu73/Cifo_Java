package app;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Hunter;
import model.Screen;
import repository.HunterRepository;
import repository.ScreenRepository;

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

		// Create our repositories ...
		HunterRepository hunterRepository = new HunterRepository(entityManager);
		ScreenRepository screenRepository = new ScreenRepository(entityManager);

		Hunter hunter1 = new Hunter("E", "Mary");
		Optional<Hunter> savedHunter1 = hunterRepository.save(hunter1);
		System.out.println("Saved hunter: " + savedHunter1.get());
		
		Screen screen = new Screen();
		screen.initScreen();
		screen.printScreen();

		// Create a hunter
		screen.addHunter(new Hunter("H", "Andreu"));
		screen.addHunter(new Hunter("A", "Anne"));
		System.out.println(screen);
		Optional<Screen> savedScreen1 = screenRepository.save(screen);

		System.out.println("Saved screen: " + savedScreen1.get());
//		List<Hunter> hunters = hunterRepository.findAll();
//		System.out.println("Authors:");
//		for (Hunter authorToPrint : hunters) {
//			System.out.println(authorToPrint);
//		}
//
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
