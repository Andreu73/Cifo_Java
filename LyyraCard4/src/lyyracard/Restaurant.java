package lyyracard;

import java.util.ArrayList;

public class Restaurant {
	
	private int restaurantId;	
	private String name;
	private static ArrayList<CashRegister> cashregisters;
	
	public Restaurant(int restaurantId, String name) {
		this.restaurantId = restaurantId;
		this.name = name;
		cashregisters = new ArrayList<CashRegister>();
	}
	
	public void addCashRegsiterToUniversity(CashRegister cashregister) {
		
		cashregisters.add(cashregister);
	}
	
	public static void cashRegisterList() {
		
		for(CashRegister cashregis : cashregisters) {
			System.out.println(cashregis.listOfCashRegisters());
		}
	}
	
	public static CashRegister cashregisterIdentification(int cashregister) {
		
		for(CashRegister cashregis : cashregisters) {
			
			if(cashregis.getCashregsiterId()==cashregister)
				return cashregis;
		}
		return null;
	}

}
