package comptadies;

import java.util.Scanner;

public class View {
	
	public void start() {
		
		Scanner reader = new Scanner(System.in);
		
		Boolean isOk = false;
		MyDate newDate = null;
		
		while(isOk==false) {

		System.out.println("Day: ");
		int day = reader.nextInt();
		System.out.println("Month: ");
		int month = reader.nextInt();
		System.out.println("Year: ");
		int year = reader.nextInt();
		
		newDate = new MyDate(day, month, year);
		isOk = MyDate.isYearOk(year);
			
		}
		
		MyDate.returnDays(newDate);
		
	}

}
