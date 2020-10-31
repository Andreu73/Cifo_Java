package model;

import java.util.Random;
import java.util.Scanner;

import app.Main;
import controller.ScreenObjectController;
import interfaces.IScreenObject;
import service.HunterDb;
import service.VampireDb;

public class Vampire extends ScreenObject {
	
	public int pointsObject;
	Random random = new Random();

	public Vampire(String name, String symbol, int pointsObject) {
		super(name, symbol);
		this.pointsObject = pointsObject;
	}
	
	public int getPointsObject() {
		return pointsObject;
	}
	
	public static int randomOfTwoNumbers() {
		
		int a = 1;
		int b = -1;
		int randomNumber = new Random().nextBoolean()? a : b;
		return randomNumber;
		
	}

	public static void moveVampireToHunter(VampireDb vampireDb, String keyPressed) {
		
		for (int i = 0; i < Main.VAMPIRES; i++) {
		
		int hunterX = HunterDb.hunters.get(0).position.getX();
		int vampireX = VampireDb.vampires.get(i).position.getX();
		
		int hunterY = HunterDb.hunters.get(0).position.getY();
		int vampireY = VampireDb.vampires.get(i).position.getY();
		
		//
		
		if((vampireX < hunterX && vampireY < hunterY) && (keyPressed.equals("w") || keyPressed.equals("d"))){
			VampireDb.vampires.get(i).position.setX(VampireDb.vampires.get(i).position.getX()+1);
		}
		else if((vampireX < hunterX && vampireY < hunterY) && (keyPressed.equals("a") || keyPressed.equals("s"))){
			VampireDb.vampires.get(i).position.setY(VampireDb.vampires.get(i).position.getY()+1);
		}

		//
		else if ((vampireX > hunterX && vampireY < hunterY) && (keyPressed.equals("w") || keyPressed.equals("a"))){
			VampireDb.vampires.get(i).position.setX(VampireDb.vampires.get(i).position.getX()-1);
		}
		else if ((vampireX > hunterX && vampireY < hunterY) && (keyPressed.equals("s") || keyPressed.equals("d"))){
			VampireDb.vampires.get(i).position.setY(VampireDb.vampires.get(i).position.getY()+1);
		}

		//
		else if ((vampireX > hunterX && vampireY > hunterY) && (keyPressed.equals("w") || keyPressed.equals("d"))){
			VampireDb.vampires.get(i).position.setY(VampireDb.vampires.get(i).position.getY()-1);
		}
		else if ((vampireX > hunterX && vampireY > hunterY) && (keyPressed.equals("a") || keyPressed.equals("s"))){
			VampireDb.vampires.get(i).position.setX(VampireDb.vampires.get(i).position.getX()-1);
		}

		//
		else if ((vampireX < hunterX && vampireY > hunterY) && (keyPressed.equals("a") || keyPressed.equals("w"))){
			VampireDb.vampires.get(i).position.setY(VampireDb.vampires.get(i).position.getY()-1);
		}
		else if ((vampireX < hunterX && vampireY > hunterY) && (keyPressed.equals("d") || keyPressed.equals("s"))){
			VampireDb.vampires.get(i).position.setX(VampireDb.vampires.get(i).position.getX()+1);
		}
		
		
		
		else if (vampireX == hunterX && (vampireY < hunterY)){
			VampireDb.vampires.get(i).position.setY(VampireDb.vampires.get(i).position.getY()+1);
		}
		else if (vampireX == hunterX && (vampireY > hunterY)){
			VampireDb.vampires.get(i).position.setY(VampireDb.vampires.get(i).position.getY()-1);
		}
		else if (vampireY == hunterY && (vampireX < hunterX)){
			VampireDb.vampires.get(i).position.setX(VampireDb.vampires.get(i).position.getX()+1);
		}
		else if (vampireY == hunterY && (vampireX > hunterX)){
			VampireDb.vampires.get(i).position.setX(VampireDb.vampires.get(i).position.getX()-1);
		}
			
		}
		
		
	}
	
	//
	public static void moveVampireAwayFromHunter(VampireDb vampireDb, String keyPressed) {
		
	for (int i = 0; i < Main.VAMPIRES; i++) {

			int hunterX = HunterDb.hunters.get(0).position.getX();
			int vampireX = VampireDb.vampires.get(i).position.getX();
			
			int hunterY = HunterDb.hunters.get(0).position.getY();
			int vampireY = VampireDb.vampires.get(i).position.getY();
		
//			for(int j = 0; j <Main.VAMPIRES; j++) {
//				
//				if((VampireDb.vampires.get(i).position.getX()==VampireDb.vampires.get(j).position.getX())
//						&& (VampireDb.vampires.get(i).position.getY()==VampireDb.vampires.get(j).position.getY())){
//					VampireDb.vampires.get(i).position.setX((VampireDb.vampires.get(i).position.getX()));
//					VampireDb.vampires.get(i).position.setY((VampireDb.vampires.get(i).position.getY()));
//				}
//			}

			//
			if(VampireDb.vampires.get(i).position.getX()==Main.LENGTH-1) {
				VampireDb.vampires.get(i).position.setX(Main.LENGTH-1);
			}
			else if (VampireDb.vampires.get(i).position.getX()==0) {
				VampireDb.vampires.get(i).position.setX(0);
			}
			else if (VampireDb.vampires.get(i).position.getY()==Main.HEIGHT-1) {
				VampireDb.vampires.get(i).position.setY(Main.HEIGHT-1);
			}
			else if (VampireDb.vampires.get(i).position.getY()==0) {
				VampireDb.vampires.get(i).position.setY(0);
			}
			
			
			else if((vampireX < hunterX && vampireY < hunterY) && (keyPressed.equals("w") || keyPressed.equals("d"))){
				VampireDb.vampires.get(i).position.setX(VampireDb.vampires.get(i).position.getX()-1);
			}
			else if((vampireX < hunterX && vampireY < hunterY) && (keyPressed.equals("a") || keyPressed.equals("s"))){
				VampireDb.vampires.get(i).position.setY(VampireDb.vampires.get(i).position.getY()-1);
			}
	
			//
			else if ((vampireX > hunterX && vampireY < hunterY) && (keyPressed.equals("w") || keyPressed.equals("a"))){
				VampireDb.vampires.get(i).position.setX(VampireDb.vampires.get(i).position.getX()+1);
			}
			else if ((vampireX > hunterX && vampireY < hunterY) && (keyPressed.equals("s") || keyPressed.equals("d"))){
				VampireDb.vampires.get(i).position.setY(VampireDb.vampires.get(i).position.getY()-1);
			}
	
			//
			else if ((vampireX > hunterX && vampireY > hunterY) && (keyPressed.equals("w") || keyPressed.equals("d"))){
				VampireDb.vampires.get(i).position.setY(VampireDb.vampires.get(i).position.getY()+1);
			}
			else if ((vampireX > hunterX && vampireY > hunterY) && (keyPressed.equals("a") || keyPressed.equals("s"))){
				VampireDb.vampires.get(i).position.setX(VampireDb.vampires.get(i).position.getX()+1);
			}
		
			//
			else if ((vampireX < hunterX && vampireY > hunterY) && (keyPressed.equals("a") || keyPressed.equals("w"))){
				VampireDb.vampires.get(i).position.setY(VampireDb.vampires.get(i).position.getY()+1);
			}
			else if ((vampireX < hunterX && vampireY > hunterY) && (keyPressed.equals("d") || keyPressed.equals("s") )){
				VampireDb.vampires.get(i).position.setX(VampireDb.vampires.get(i).position.getX()-1);
			}
			
			else if (vampireX == hunterX && (vampireY < hunterY)){
				VampireDb.vampires.get(i).position.setY(VampireDb.vampires.get(i).position.getY()-1);
			}
			else if (vampireX == hunterX && (vampireY > hunterY)){
				VampireDb.vampires.get(i).position.setY(VampireDb.vampires.get(i).position.getY()+1);
			}
			else if (vampireY == hunterY && (vampireX < hunterX)){
				VampireDb.vampires.get(i).position.setX(VampireDb.vampires.get(i).position.getX()-1);
			}
			else if (vampireY == hunterY && (vampireX > hunterX)){
				VampireDb.vampires.get(i).position.setX(VampireDb.vampires.get(i).position.getX()+1);
			}
				
			}	
			

	}

}
	
