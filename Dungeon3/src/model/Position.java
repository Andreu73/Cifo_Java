package model;

import java.util.ArrayList;
import java.util.Random;

import app.Main;
import interfaces.IScreenObject;
import service.PositionDb;

public class Position {
	
	public int x;
	public int y;
  	int[] position = {x,y};
  	public ArrayList<int[]> positionsArray ;
  	public ArrayList<Integer> auxPositionsArray;
	Random random = new Random();
	
	public Position() {
		super();
	   	this.checkRepeatedPosition();
		auxPositionsArray = new ArrayList<>();
		this.x = auxPositionsArray.get(0);
	   	this.y = auxPositionsArray.get(1);


	}

	public void checkRepeatedPosition() {
		
		int x = initialNumberInLength();
		int y = initialNumberInHeight();
		
	   	System.out.println(x);
	   	
	   	int[] position = {x, y};
	   	
	   	boolean isNew=false;
	   	
		   	while(isNew==false) {
			
			  	for(int k =0; k<this.positionsArray.size(); k++) {
		
			  		for(int i =0; i<position.length; i++) {
			   		 
			  			if(position[i]!=positionsArray.get(k)[i]) {
				   			 
			  				positionsArray.add(position);
			  				System.out.println("Not repeated");
			  				isNew=true;
			  				this.setX(x);
			  				this.setY(y);
			  				
				   		 }
			   		 }
			   	 }
		   	}
		System.out.println("Ok");
		

	}

	public int initialNumberInLength() {
		int numberLength = random.nextInt(Main.LENGTH);
//		this.x=numberLength;
		return numberLength;

	}
	
	public int initialNumberInHeight() {
		int numberHeight = random.nextInt(Main.HEIGHT);
//		this.y=numberHeight;
		return numberHeight;
		
	}
	
	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}
	

}


/*

class Main {
    
    public static int randomNumberInLength(Random random) {
   	 //Math.random() * (max - min + 1) + min
   	 int numberLength = random.nextInt(5);
   	 return numberLength;
   	 
    }
    
    public static int randomNumberInHeight(Random random) {
   	 //Math.random() * (max - min + 1) + min
   	 int numberHeight = random.nextInt(5);
   	 return numberHeight;
   	 
    }

	public static void main(String args[]) {
   	 Random random = new Random();
   	 
   	 ArrayList<int[]> positionsArray = new ArrayList<>();
   	 
   	 int x = 2;
   	 int y =3;
   	 int c = 4;
   	 int[] position = {x, y};
   	 int[] position2 = {x, y};
   	 
   	 positionsArray.add(position);
	 
   	 System.out.println("dagfearsgv");

//   	 boolean isNew=false;
   	 for(int k =0; k<positionsArray.size(); k++) {

   		 for(int i =0; i<position2.length; i++) {
   		 
   		 if(position2[i]!=positionsArray.get(k)[i]) {
   			 
   			 positionsArray.add(position2);
   			 System.out.println("Not repeated");
   		 }
   	 }

   	 }

   	 for(int[] posis2 : positionsArray) {
   		 
   		 System.out.println(posis2);
   	 }*/

