package utilsdb;

import java.util.ArrayList;

import model.Airplane;
import model.AirplanePassengers;
import model.AirplaneTransport;
import service.AirCompanyDb;
import service.AirplaneDb;

public class AirplanePreFillingDb {
	
	public static void preFillingAirplanesToDb() {
		
		ArrayList<Airplane> airplanes = new ArrayList<>();
		
		airplanes.add(new AirplanePassengers(AirCompanyDb.aircompanies.get(0), 200));
		airplanes.add(new AirplanePassengers(AirCompanyDb.aircompanies.get(1), 300));
		airplanes.add(new AirplanePassengers(AirCompanyDb.aircompanies.get(2), 150));
		airplanes.add(new AirplanePassengers(AirCompanyDb.aircompanies.get(3), 175));
		airplanes.add(new AirplanePassengers(AirCompanyDb.aircompanies.get(4), 300));
		airplanes.add(new AirplanePassengers(AirCompanyDb.aircompanies.get(5), 500));
		
		airplanes.add(new AirplaneTransport(AirCompanyDb.aircompanies.get(0), 10000));
		airplanes.add(new AirplaneTransport(AirCompanyDb.aircompanies.get(1), 5000));
		airplanes.add(new AirplaneTransport(AirCompanyDb.aircompanies.get(2), 60000));
		airplanes.add(new AirplaneTransport(AirCompanyDb.aircompanies.get(3), 6500));
		airplanes.add(new AirplaneTransport(AirCompanyDb.aircompanies.get(4), 3000));
		airplanes.add(new AirplaneTransport(AirCompanyDb.aircompanies.get(5), 8000));
		
		AirplaneDb.setAirplanes(airplanes);
		
	}

}
