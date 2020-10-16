package comptadies;

public class MyDate {
	
	final static int DAYS_YEAR = 365;
	private int day, month, year;
	private static String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	private int[] monthDays = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	public MyDate() {
		
	}
	
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public static Boolean isLeapYear(int leapyear) {
		
		if(leapyear%4==0 && (leapyear%100!=0 || leapyear%400==0)) {
			return true;}
		else
			return false;
			
	}
	
	public static void returnDays(MyDate mydate) {
		
		int days = 0;
		int year2 = mydate.year - 1978;
		days = mydate.day-1;

		for (int i = 1978; i <= mydate.year; i++) {
			
			if(isLeapYear(i))
				days ++;
		}
		
		for (int i = 0; i < mydate.month; i++) {
			
			days += mydate.monthDays[i];
		}
		
		days += DAYS_YEAR * year2;	
		returnWeekDay(days);
		
	}

	public static void returnWeekDay(int daysperyear) {
		
		int dayOfTheWeek = daysperyear%7;
		System.out.println(weekDays[dayOfTheWeek]);
	}
	
	public static Boolean isYearOk(int year) {
		
		if(year<1978) {
			System.out.println("Year before 1978 not valid");
			return false;}
		else
			return true;
		
	}

}