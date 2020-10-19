package comptadies;

import java.util.Scanner;

public class View {
	
	public void start(Scanner input) {
		
		Boolean isOk = false;
		MyDate newDate = null;
		int day =0;
		int month= 0;
		int year =0;
		
		while(isOk==false) {

		try {	
			
		System.out.println("Day (dd): ");
		day = input.nextInt();
		}catch(Exception e){
			e.getMessage();
			
		}
		
		System.out.println("Month (mm): ");
		month = input.nextInt();
		System.out.println("Year (yyyy): ");
		year = input.nextInt();
		

		
		newDate = new MyDate(day, month, year);
		isOk = MyDate.isYearOk(year);
			
		}
		
		MyDate.returnDays(newDate);
		
	}

}
