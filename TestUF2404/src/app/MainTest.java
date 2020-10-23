package app;

import java.util.Scanner;
import utilsdb.AuthorDbPreFilling;
import utilsdb.BookDbPreFilling;
import view.View;

public class MainTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		AuthorDbPreFilling.preFillingAuthorsToDb();
		BookDbPreFilling.preFillingBooksToDb();
		
		View view = new View();
		view.start(input);
		
	}
	

}
