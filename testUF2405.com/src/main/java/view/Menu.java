package view;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import repository.BookRepository;
import repository.QuoteRepository;

public class Menu {

	public Menu() {
	}

	public void loopIO(BookRepository birdRepository, QuoteRepository personRepository) {

		Scanner reader = new Scanner(System.in);
//		MongoDatabase database = Controller.init();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Menu printMenu = new Menu();
//		printMenu.showMenu();

		while (true) {

			printMenu.showMenu();
			int command = ask(reader, "Option?");
			if(command==3) {
				break;
			}
			
			MenuOptions.selectedCommand(command, reader, birdRepository, personRepository);
			
			}

	}
	
	public static int ask(Scanner reader, String option) {

		System.out.println(option);
		int intOption = reader.nextInt();
		return intOption;
	}
	
	
	public void showMenu() {

		//print all menu
		System.out.println("\r" + "Main Menu:");
		System.out.println("---------------------------------");
//		System.out.println("Type one option, please:");
		System.out.println(MenuOptions.optionList());
		System.out.println("---------------------------------");

	}

}

