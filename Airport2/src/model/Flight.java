package model;

public class Flight {

	public Airplane airplane;
	public Airport airportDeparture;
	public Airport airportDestination;
	
	public Flight(Airplane airplane, Airport airportDeparture, Airport airportDestination) {
		super();
		this.airplane = airplane;
		this.airportDeparture = airportDeparture;
		this.airportDestination = airportDestination;
	}
	
	
}
