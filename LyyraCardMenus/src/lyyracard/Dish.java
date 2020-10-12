package lyyracard;

public class Dish {
	
	private int dishId;
	private String name;
	private String dishType;
	private double price;
	
	public Dish(int dishId, String name, String dishType, double price) {
		this.dishId = dishId;
		this.name = name;
		this.dishType = dishType;
		this.price = price;
		
	}


	public int getDishId() {
		return dishId;
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}


	public String toString() {
		return this.dishId +". " + dishType +" - " +name + " - " + price + " Eur";
	}


	
	

}
