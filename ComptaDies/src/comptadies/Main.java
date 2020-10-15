package comptadies;

public class Main {

	public static void main(String[] args) {
		

		MyDate newDate = new MyDate();

		int daysPerYear = newDate.returnDays(newDate.readDate());
		System.out.println(newDate.returnWeekDay(daysPerYear));

	}

}
