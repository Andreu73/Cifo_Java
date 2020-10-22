package model;

public class Dog extends Animal{

	public boolean isVaccinated;

	public Dog(String name, int age, boolean isVaccinated) {
		super(name, age);
		this.isVaccinated = isVaccinated;
	}
	
	
	public void listen(){
		
		System.out.println("The dog listens to the door sound");
	}
	
	public void eat(){
		
		System.out.println("Dog eats meat");
	}
	
	public void play(){
		
		System.out.println("The dog plays with a cat");
	}
	
	public void sleep(){
		
		System.out.println("The cat sleeps next to the fireplace");
	}

}
