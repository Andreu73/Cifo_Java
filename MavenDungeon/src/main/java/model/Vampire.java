package model;

import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VAMPIRE")

public class Vampire extends GameObject{
	
//    @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int points;
	public String symbol;

	public Vampire(String symbol, int points) {
		super(symbol);
		this.points = points;
		
	}
	
	public static int randomOfTwoNumbers() {
		
		int a = 1;
		int b = -1;
		int randomNumber = new Random().nextBoolean()? a : b;
		return randomNumber;
		
	}

//	public static void moveVampireToHunter(ArrayList<GameObject> go, String keyPressed) {
//				
//		GameObject goVampire = null;
//		for (int i = 0; i < go.size(); i++) {
//			if(GameObjectDb.gameObjects.get(i) instanceof Vampire) {
//			goVampire = GameObjectDb.gameObjects.get(i);
//			}
//		}	
//		
//		for (int i = 0; i < Main2.VAMPIRES; i++) {
//		
//		int hunterX = HunterDb.hunters.get(0).getX();
//		int vampireX = goVampire.getX();
//		
//		int hunterY = HunterDb.hunters.get(0).getY();
//		int vampireY = goVampire.getY();
//		
//		//
//		
//		if((vampireX < hunterX && vampireY < hunterY) && (keyPressed.equals("w") || keyPressed.equals("d"))){
//			goVampire.setX(goVampire.getX()+1);
//		}
//		else if((vampireX < hunterX && vampireY < hunterY) && (keyPressed.equals("a") || keyPressed.equals("s"))){
//			goVampire.setY(goVampire.getY()+1);
//		}
//
//		//
//		else if ((vampireX > hunterX && vampireY < hunterY) && (keyPressed.equals("w") || keyPressed.equals("a"))){
//			goVampire.setX(goVampire.getX()-1);
//		}
//		else if ((vampireX > hunterX && vampireY < hunterY) && (keyPressed.equals("s") || keyPressed.equals("d"))){
//			goVampire.setY(goVampire.getY()+1);
//		}
//
//		//
//		else if ((vampireX > hunterX && vampireY > hunterY) && (keyPressed.equals("w") || keyPressed.equals("d"))){
//			goVampire.setY(goVampire.getY()-1);
//		}
//		else if ((vampireX > hunterX && vampireY > hunterY) && (keyPressed.equals("a") || keyPressed.equals("s"))){
//			goVampire.setX(goVampire.getX()-1);
//		}
//
//		//
//		else if ((vampireX < hunterX && vampireY > hunterY) && (keyPressed.equals("a") || keyPressed.equals("w"))){
//			goVampire.setY(goVampire.getY()-1);
//		}
//		else if ((vampireX < hunterX && vampireY > hunterY) && (keyPressed.equals("d") || keyPressed.equals("s"))){
//			goVampire.setX(goVampire.getX()+1);
//		}
//		
//		
//		
//		else if (vampireX == hunterX && (vampireY < hunterY)){
//			goVampire.setY(goVampire.getY()+1);
//		}
//		else if (vampireX == hunterX && (vampireY > hunterY)){
//			goVampire.setY(goVampire.getY()-1);
//		}
//		else if (vampireY == hunterY && (vampireX < hunterX)){
//			goVampire.setX(goVampire.getX()+1);
//		}
//		else if (vampireY == hunterY && (vampireX > hunterX)){
//			goVampire.setX(goVampire.getX()-1);
//		}
//			
//		}
//		
//		
//	}
//	
//	//
//	public static void moveVampireAwayFromHunter(ArrayList<GameObject> go, String keyPressed) {
//		
//		GameObject goVampire = null;
//		for (int i = 0; i < go.size(); i++) {
//			if(GameObjectDb.gameObjects.get(i) instanceof Vampire) {
//			goVampire = GameObjectDb.gameObjects.get(i);
//			}
//		}	
//		
//		
//	for (int i = 0; i < Main2.VAMPIRES; i++) {
//
//			int hunterX = HunterDb.hunters.get(0).getX();
//			int vampireX = goVampire.getX();
//			
//			int hunterY = HunterDb.hunters.get(0).getY();
//			int vampireY = goVampire.getY();
//		
//			for(int j = 0; j <Main.VAMPIRES; j++) {
//				
//				if((VampireDb.vampires.get(i).position.getX()==VampireDb.vampires.get(j).position.getX())
//						&& (VampireDb.vampires.get(i).position.getY()==VampireDb.vampires.get(j).position.getY())){
//					VampireDb.vampires.get(i).position.setX((VampireDb.vampires.get(i).position.getX()));
//					VampireDb.vampires.get(i).position.setY((VampireDb.vampires.get(i).position.getY()));
//				}
//			}
//
//			//
//			if((goVampire.getX()==Main2.WIDTH-1) 
//					&& (goVampire.getY()==0)){
//				goVampire.setX(Main2.WIDTH-1);
//				goVampire.setY(0);
//			}
//			else if ((goVampire.getX()==0) 
//				&& (goVampire.getY()==0)){
//				goVampire.setX(0);
//				goVampire.setY(0);
//			}
//			else if ((goVampire.getY()==Main2.HEIGHT-1) 
//				&& (goVampire.getX()==Main2.WIDTH-1)) {
//				goVampire.setX(Main2.WIDTH-1);
//				goVampire.setY(Main2.HEIGHT-1);
//			}
//			else if ((goVampire.getX()==0) 
//				&& (goVampire.getY()==Main2.HEIGHT-1)){
//				goVampire.setX(0);
//				goVampire.setY(Main2.HEIGHT-1);
//			}
//			
//			//
//			else if(goVampire.getX()==Main2.WIDTH-1) {
//				goVampire.setX(Main2.WIDTH-1);
//				goVampire.setY(goVampire.getY()+randomOfTwoNumbers());
//			}
//			else if (goVampire.getX()==0) {
//				goVampire.setX(0);
//				goVampire.setY(goVampire.getY()+randomOfTwoNumbers());
//			}
//			else if (goVampire.getY()==Main2.HEIGHT-1) {
//				goVampire.setY(Main2.HEIGHT-1);
//				goVampire.setX(goVampire.getX()+randomOfTwoNumbers());
//			}
//			else if (goVampire.getY()==0) {
//				goVampire.setY(0);
//				goVampire.setX(goVampire.getX()+randomOfTwoNumbers());
//			}
//			
//			
//			else if((vampireX < hunterX && vampireY < hunterY) && (keyPressed.equals("w") || keyPressed.equals("d"))){
//				goVampire.setX(goVampire.getX()-1);
//			}
//			else if((vampireX < hunterX && vampireY < hunterY) && (keyPressed.equals("a") || keyPressed.equals("s"))){
//				goVampire.setY(goVampire.getY()-1);
//			}
//	
//			//
//			else if ((vampireX > hunterX && vampireY < hunterY) && (keyPressed.equals("w") || keyPressed.equals("a"))){
//				goVampire.setX(goVampire.getX()+1);
//			}
//			else if ((vampireX > hunterX && vampireY < hunterY) && (keyPressed.equals("s") || keyPressed.equals("d"))){
//				goVampire.setY(goVampire.getY()-1);
//			}
//	
//			//
//			else if ((vampireX > hunterX && vampireY > hunterY) && (keyPressed.equals("w") || keyPressed.equals("d"))){
//				goVampire.setY(goVampire.getY()+1);
//			}
//			else if ((vampireX > hunterX && vampireY > hunterY) && (keyPressed.equals("a") || keyPressed.equals("s"))){
//				goVampire.setX(goVampire.getX()+1);
//			}
//		
//			//
//			else if ((vampireX < hunterX && vampireY > hunterY) && (keyPressed.equals("a") || keyPressed.equals("w"))){
//				goVampire.setY(goVampire.getY()+1);
//			}
//			else if ((vampireX < hunterX && vampireY > hunterY) && (keyPressed.equals("d") || keyPressed.equals("s") )){
//				goVampire.setX(goVampire.getX()-1);
//			}
//			
//			else if (vampireX == hunterX && (vampireY < hunterY)){
//				goVampire.setY(goVampire.getY()-1);
//			}
//			else if (vampireX == hunterX && (vampireY > hunterY)){
//				goVampire.setY(goVampire.getY()+1);
//			}
//			else if (vampireY == hunterY && (vampireX < hunterX)){
//				goVampire.setX(goVampire.getX()-1);
//			}
//			else if (vampireY == hunterY && (vampireX > hunterX)){
//				goVampire.setX(goVampire.getX()+1);
//			}
//				
//			}	
//			
//
//	}
}
