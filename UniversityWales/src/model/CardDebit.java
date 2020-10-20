package model;

public class CardDebit extends Card{
	
	private Boolean isExecuted;

	public CardDebit(Boolean isActivated, Date dateOfActivation, double balance, boolean isExecuted) {
		super(isActivated, dateOfActivation, balance);
		this.isExecuted = isExecuted;
	}

}
