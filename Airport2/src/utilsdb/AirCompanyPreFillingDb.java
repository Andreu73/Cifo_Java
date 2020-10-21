package utilsdb;

import java.util.ArrayList;

import model.AirCompany;
import service.AirCompanyDb;

public class AirCompanyPreFillingDb {
	
	public static void preFillingAirCompaniesToDb() {
		
		ArrayList<AirCompany> aircompanies = new ArrayList<>();
		
		aircompanies.add(new AirCompany("Air France"));
		aircompanies.add(new AirCompany("Italia Airlines"));
		aircompanies.add(new AirCompany("NZ Airlines"));
		aircompanies.add(new AirCompany("Swiss Air"));
		aircompanies.add(new AirCompany("Alaska Airlines"));
		aircompanies.add(new AirCompany("India Airlines"));
		aircompanies.add(new AirCompany("Russia Airlines"));
		
		AirCompanyDb.setAircompanies(aircompanies);
	}

}
