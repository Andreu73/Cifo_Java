package comptadies;

import java.util.Scanner;

public class MyDate {
	
	final int DAYS_YEAR = 365;
	private int day;
	private int month;
	private int year;
	private String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	private int[] monthDays = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	public MyDate() {
		
	}
	
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public MyDate readDate() {
		
		Scanner reader = new Scanner(System.in);
		Boolean isOk = false;
		MyDate newDate = null;
		
		while(isOk==false) {

		System.out.println("Day: ");
		this.day = reader.nextInt();
		System.out.println("Month: ");
		this.month = reader.nextInt();
		System.out.println("Year: ");
		this.year = reader.nextInt();
		
		newDate = new MyDate(this.day, this.month, this.year);
		
		isOk = isYearOk();
			
		}
		
		return newDate;
		
	}

	public Boolean isLeapYear(int leapyear) {
		
		if(leapyear%4==0 && (leapyear%100!=0 || leapyear%400==0)) {
			return true;}
		else
			return false;
			
	}
	
	public int returnDays(MyDate mydate) {
		
		int days = 0;
		int year2 = this.year - 1978;
		days = day-1;

		for (int i = 1978; i <= this.year; i++) {
			
			if(isLeapYear(i))
				days ++;
		}
		
		for (int i = 0; i < this.month; i++) {
			
			days += this.monthDays[i];
		}
		
		days += DAYS_YEAR * year2;	
		return days;
		
	}
	
	public String returnWeekDay(int daysperyear) {
		
		int dayOfTheWeek = daysperyear%7;
		return weekDays[dayOfTheWeek];
	}
	
	public Boolean isYearOk() {
		
		if(this.year<1978) {
			System.out.println("Year before 1978 not valid");
			return false;}
		else
			return true;
		
	}

}
