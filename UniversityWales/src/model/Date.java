package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
	
	public String date;
	public LocalDateTime now;
	
	public Date(String date){
		
		this.date = date;
		
	}
	
	public Date(){
		
		this.now = LocalDateTime.now();
		
	}

	public String formatNow() {
		DateTimeFormatter newDateFormat = DateTimeFormatter.ofPattern("dd-mm-yyyy");
	    String formattedDate = now.format(newDateFormat);
	    return formattedDate;
	}
	
	public String formatDate() {
		String formattedDate = this.date.substring(0, 2) + "-" + this.date.substring(2, 4)+
				"-" + this.date.substring(4, 8);
		return formattedDate;
	}

	@Override
	public String toString() {
		return "Date [date=" + date + "]";
	}
	
	
	
}
