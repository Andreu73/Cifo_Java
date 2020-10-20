package model;

public class Card {
	
	protected int cardNumber;
	protected Boolean isActivated;
	protected Date dateOfActivation;
	protected double balance;

	
	public Card(Boolean isActivated, Date dateOfActivation, double balance) {
		super();
		this.cardNumber = hashCode();
		this.isActivated = isActivated;
		this.dateOfActivation = dateOfActivation;
		this.balance = 0.00d;
		
	}

}
