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
	
	
}
