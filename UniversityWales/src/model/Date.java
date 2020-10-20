package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
	
	private LocalDateTime myDate = LocalDateTime.now();
	
	public Date(){
		
	}

	public String formatMyDate() {
		DateTimeFormatter newDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	    String formattedDate = myDate.format(newDateFormat);
	    return formattedDate;
	}
}
