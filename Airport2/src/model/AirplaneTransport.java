package model;

public class AirplaneTransport extends Airplane{

	public double load;

	public AirplaneTransport(AirCompany airCompany, double load) {
		super(airCompany);
		this.load = load;
	}

	@Override
	public String toString() {
		return "Airplane Transport [load: " + load + "]\n";
	}


}
