package model;

public class AirplanePassengers extends Airplane{
	
	public int numberOfPassengers;

	public AirplanePassengers(AirCompany airCompany, int numberOfPassengers) {
		super(airCompany);
		this.numberOfPassengers = numberOfPassengers;
	}

	@Override
	public String toString() {
		return "Passengers airplane: passengers: " + numberOfPassengers + "\n";
	}


	

}
