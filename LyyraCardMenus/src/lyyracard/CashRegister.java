package lyyracard;

import java.util.ArrayList;

public class CashRegister {

	private int cashregsiterId;
	private double cashInRegister;
	private static ArrayList<Dish> dishessold ;

    public CashRegister(int cashregsiterid) {
    	this.cashregsiterId= cashregsiterid;
    	this.cashInRegister= 1000.00;
    	dishessold = new ArrayList<Dish>();

    }
    
    public int getCashregsiterId() {
		return cashregsiterId;
	}
    
    public void addDish(Dish dish) {
    	
    	dishessold.add(dish);
    }

	public void payMenuCash(CashRegister cashregister, double totalprice, double cashGiven) {
		MyDate dateofoperation ;
		cashregister.cashInRegister+=totalprice;
    	double cashBack = cashGiven-totalprice;
    	dateofoperation = new MyDate();
    	System.out.println(dateofoperation.formatMyDate() + "\n"+ cashBack + " given back\nOperation finished!");
	    		 	
    }
	
	public void payMenuCard(CashRegister cashregister, LyyraCard lyyracard, double totalprice) {
		MyDate dateofoperation ;
		lyyracard.setBalance(lyyracard.getBalance()-totalprice);
		cashregister.cashInRegister+=totalprice;
		dateofoperation = new MyDate();
		System.out.println(dateofoperation.formatMyDate() + "\nOperation finished!");
    }

	public String listOfDishesSold() {
		
		String list = "";
		double totalPrice = 0;
		for(Dish dishessoldlist : dishessold) {
			totalPrice += dishessoldlist.getPrice();
			list = list + "Dish number: " +dishessoldlist.getDishId()+" - Name: "+
			dishessoldlist.getName()+" - Price: " +dishessoldlist.getPrice();

		}
		return list + "\nTotal Price: " + totalPrice;
	}
	
	public String listOfCashRegisters() {
    	return "Cash Register Number: " + this.getCashregsiterId();
    }

	 public String toString() { 
		 return "Cash Register Number: " + this.getCashregsiterId() + " - Money in register "+cashInRegister;
	 }

}