package model;

public class Cat extends Animal{

	public int numberOfLives;

	public Cat(String name, int numberOfLives) {
		super(name);
		this.numberOfLives = numberOfLives;
	}
	
	
	public void listen(){
		
		System.out.println("Listen to its Master!");
	}
	
	public void eat(){
		
		System.out.println("It eats a fish");
	}
	
	public void play(){
		
		System.out.println("It plays with a dog");
	}
	
	public void sleep(){
		
		System.out.println("It sleeps on the sofa");
	}


	
}
