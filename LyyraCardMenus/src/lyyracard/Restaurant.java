package lyyracard;

import java.util.ArrayList;

public class Restaurant {
	
	private int restaurantId;	
	private String name;
	private static ArrayList<CashRegister> cashregisters;
	private static ArrayList<Dish> dishes;
	
	public Restaurant(int restaurantId, String name) {
		this.restaurantId = restaurantId;
		this.name = name;
		cashregisters = new ArrayList<CashRegister>();
		dishes = new ArrayList<Dish>();
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
	
	public void addDishToRestaurant(Dish dish) {
		
		dishes.add(dish);
	}
	
	public static void menuList() {
		
		for(Dish dishlist : dishes) {
			System.out.println(dishlist);
		}
	}
	
	public static Dish selectMenuFormTheList(int dish) {
		
		for(Dish dishlist : dishes) {
			
			if(dishlist.getDishId()==dish)
				return dishlist;
		}
		return null;
	}

}
