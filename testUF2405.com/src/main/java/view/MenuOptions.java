package view;

import java.util.Scanner;

import controller.BookRepositoryController;
import controller.QuoteRepositoryController;
import repository.BookRepository;
import repository.QuoteRepository;

public enum MenuOptions {

//	AddBook{
//		@Override
//		public void optionBook(Scanner reader, BookRepository birdRepository, QuoteRepository personRepository) {
//
//		}
//		
//	},
//	
//	AddQuote{
//		@Override
//		public void optionBook(Scanner reader, BookRepository birdRepository, QuoteRepository personRepository) {
//
//		}
//	},
	ShowBook{
		@Override
		public void optionBook(Scanner reader, BookRepository birdRepository, QuoteRepository personRepository) {
			BookRepositoryController.listAllBooks(birdRepository);
			
		}
		
	},
	
	ShowQuote{
		@Override
		public void optionBook(Scanner reader, BookRepository birdRepository, QuoteRepository personRepository) {
			QuoteRepositoryController.listAllQuotes(personRepository);
//			return show;
		}
		
	},

//	DeleteBook{
//		@Override
//		public void optionBook(Scanner reader, BookRepository birdRepository, QuoteRepository personRepository) {
//			BookRepositoryController.deleteBookByName(birdRepository);
//		}
//	},
	
	Quit{
		@Override
		public void optionBook(Scanner reader, BookRepository birdRepository, QuoteRepository personRepository) {

		}
	};
	
//	Unknown{
//		@Override
//		public void optionBook(Scanner reader, BookRepository birdRepository, QuoteRepository personRepository) {
//
//		}
//		
//	};
	
	public abstract void optionBook(Scanner reader, BookRepository birdRepository, QuoteRepository personRepository);
//	public int option;
	
	MenuOptions() {
	}

	public static String optionList() {
		
		String options = "";
		int count = 1;
		for(MenuOptions option : MenuOptions.values()) {
			options =options +count +". "+ option.name() +"\n";
			count++;

		}
		return options;
	}
	
	public static void selectedCommand(int optionSelected, Scanner reader, BookRepository birdRepository, QuoteRepository personRepository) {
		int count = 1;
		for(MenuOptions option : MenuOptions.values()) {
			if(optionSelected== count) {
				option.optionBook(reader, birdRepository, personRepository);
			}
			count++;
		}

	}

	

}
