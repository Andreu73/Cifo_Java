package lyyracard;

public class LyyraCard {

	private int lyyracardId;
	private MyDate dateOfExecution;
	private double balance;

    public LyyraCard(int lyyracardid) {
    	this.lyyracardId= lyyracardid;
    	this.dateOfExecution = new MyDate();
        this.balance = 0.00d;
    }

    public int getLyyracardId() {
		return lyyracardId;
	}
    
	public String getDateOfExecution() {
		return dateOfExecution.formatMyDate();
	}

	public double getBalance() {
        return this.balance;
    }
	
    public void setBalance(double balance) {
		this.balance = balance;
	}

    public void loadMoney(LyyraCard lyyracard, double amount) {
    	if(this.getLyyracardId()==lyyracard.getLyyracardId())
        this.balance += amount;
    	System.out.println(amount + "Eur loaded!");
    }

//    public boolean pay(LyyraCard lyyracard, double amount){
//    	
//    	if(lyyracard.getBalance() > amount) {
//    		lyyracard.balance = lyyracard.balance - amount;
//    		return true;}
//    	else
//    		return false;
//
//    }

    public String toString() {
    	return "Lyyracard number: " + this.getLyyracardId()+ " - Date of Activation: "+ this.getDateOfExecution() + " - Balance: " + this.getBalance();
    	
    }
 
}

