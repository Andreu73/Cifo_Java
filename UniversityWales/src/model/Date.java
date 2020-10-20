package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
	
	private int day;
	private int month;
	private int year;
	private LocalDateTime now; 
	
	public Date(int day, int month, int year){
		
		this.day = day;
		this.month = month;
		this.year = year;
		this.now = LocalDateTime.now();
		
	}

	public String formatNow() {
		DateTimeFormatter newDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	    String formattedDate = now.format(newDateFormat);
	    return formattedDate;
	}
	
	public String formatDate() {
		String formattedDate = Integer.toString(this.day) + "-" + Integer.toString(this.month) + "-" 
		+ Integer.toString(this.year);
		return formattedDate;
	}
}
