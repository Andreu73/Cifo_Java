package utilsdb;

import java.util.ArrayList;

import model.Apartment;
import service.ApartmentDb;

public class ApartmentInitialFilling {
	
	public static void apartmentDbPreFilling() {
		
		ArrayList<Apartment> apartments = new ArrayList<>();
		
		apartments.add(new Apartment("Block First", 1, 2, 1));
		apartments.add(new Apartment("Block Second", 2, 5, 2));
		apartments.add(new Apartment("Block Fifth", 5, 2, 2));
		apartments.add(new Apartment("Block Tenth", 10, 3, 1));
		
		ApartmentDb.setApartments(apartments);
		
	}

}
