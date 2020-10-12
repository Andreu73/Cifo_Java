package lyyracard;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyDate {
	
	private LocalDateTime myDate = LocalDateTime.now();
	
	public MyDate(){
		
	}

	public String formatMyDate() {
		DateTimeFormatter newDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss:ns");
	    String formattedDate = myDate.format(newDateFormat);
	    return formattedDate;
	}
}
