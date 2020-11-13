package controller;

import java.util.List;

import model.Quote;
import repository.QuoteRepository;

public class QuoteRepositoryController {

	public static void listAllQuotes(QuoteRepository quoteRepository) {
		
		List<Quote> quotes = quoteRepository.findAll();
		System.out.println("Quotes:");
		for (Quote quotesToPrint : quotes) {
			System.out.println(quotesToPrint);
		}

		quotes.forEach(System.out::println);
		
	}
	
	
}
