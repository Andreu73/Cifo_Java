package model;

import interfaces.IAction;

public class Animal implements IAction{
	
	public String name;

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	
	public void listen(){
		
		System.out.println("Listen to its Master!");
	}
	
	public void eat(){
		
		System.out.println("It eats meat");
	}
	
	public void play(){
		
		System.out.println("It is old");
	}
	
	public void sleep(){
		
		System.out.println("It sleeps on the sofa");
	}


}
