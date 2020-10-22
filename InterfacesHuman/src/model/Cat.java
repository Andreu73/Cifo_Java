package model;

public class Cat extends Animal{

	public int numberOfLives;

	public Cat(String name, int age, int numberOfLives) {
		super(name, age);
		this.numberOfLives = numberOfLives;
	}
	
	
	public void listen(){
		
		System.out.println("Cat listens to the rain sound");
	}
	
	public void eat(){
		
		System.out.println("The cat eats a fish");
	}
	
	public void play(){
		
		System.out.println("The cat plays with a dog");
	}
	
	public void sleep(){
		
		System.out.println("The cat sleeps on the sofa");
	}


	
}
