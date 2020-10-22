package model;

public class Flight {
	
	public int flightCodeNumber;
	public Airplane airplane;
	public Airport airportOrigin;
	public Airport airportDestination;
	
	public Flight(Airplane airplane, Airport airportOrigin, Airport airportDestination) {
		super();
		this.flightCodeNumber = hashCode();
		this.airplane = airplane;
		this.airportOrigin = airportOrigin;
		this.airportDestination = airportDestination;
	}

	
	
	public int getFlightCodeNumber() {
		return flightCodeNumber;
	}



	@Override
	public String toString() {
		return "Flight - Flight code: " + flightCodeNumber + ", airplane: " + airplane + "origin: "
				+ airportOrigin + "destination: " + airportDestination + "\n";
	}
	
	
	
	
}
