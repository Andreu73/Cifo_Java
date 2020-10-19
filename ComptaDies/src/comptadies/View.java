package comptadies;

import java.util.Scanner;

public class View {
	
	public void start() {
		
		Scanner reader = new Scanner(System.in);
		
		Boolean isOk = false;
		MyDate newDate = null;
		
		while(isOk==false) {

		System.out.println("Day (dd): ");
		int day = reader.nextInt();
		System.out.println("Month (mm): ");
		int month = reader.nextInt();
		System.out.println("Year (yyyy): ");
		int year = reader.nextInt();
		
		newDate = new MyDate(day, month, year);
		isOk = MyDate.isYearOk(year);
			
		}
		
		MyDate.returnDays(newDate);
		
	}

}
