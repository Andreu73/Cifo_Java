package model;

import interfaces.IAction;

public class Animal implements IAction{
	
	public String name;
	public int age;

	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public void listen(){
		
		System.out.println("It listens to classical music");
	}
	
	public void eat(){
		
		System.out.println("It eats meat");
	}
	
	public void play(){
		
		System.out.println("It plays with a ball");
	}
	
	public void sleep(){
		
		System.out.println("It sleeps on the sofa");
	}


}
