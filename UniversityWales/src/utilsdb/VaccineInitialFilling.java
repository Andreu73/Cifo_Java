package utilsdb;

import java.util.ArrayList;

import model.Date;
import model.Vaccine;

public class VaccineInitialFilling {
	
	public static void vaccineDbPreFilling() {
		
		ArrayList<Vaccine> vaccines = new ArrayList<>();
		vaccines.add(new Vaccine(new Date("31012020"),"Vaccine A", "Ok"));
		vaccines.add(new Vaccine(new Date("31052020"),"Vaccine B", "Ok"));
		vaccines.add(new Vaccine(new Date("31122020"),"Vaccine E", "Not Ok"));
		
		
	}

}
