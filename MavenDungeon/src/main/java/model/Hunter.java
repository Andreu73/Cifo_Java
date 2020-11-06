package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="HUNTER")
//@NamedQueries({ @NamedQuery(name = "HUNTER.findAllGOsXY", query = "SELECT a.x, a.y FROM HUNTER a")})


public class Hunter extends GameObject {

//	@Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public String name;
	public int points;

	public Hunter(String symbol, String name) {
		super(symbol);
		this.points = 3;
		this.name = name;
	}
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "Hunter [name=" + name + ", points=" + points + "]";
	}



//	public static void moveHunter(ArrayList<GameObject> go, Scanner input, Screen screen) {
//		
//	while(Main2.isFinished == false) {
//		
//		ArrayList<GameObject> hunters = new ArrayList<>();
//		ArrayList<GameObject> walls = new ArrayList<>();
//		
//		GameObject gous = null;
//		for (int i = 0; i < go.size(); i++) {
//			if(GameObjectDb.gameObjects.get(i) instanceof Hunter) {
//			gous = GameObjectDb.gameObjects.get(i);
//			hunters.add(gous);
//			}
//		
//			if(GameObjectDb.gameObjects.get(i) instanceof Wall) {
//			gous = GameObjectDb.gameObjects.get(i);
//			walls.add(gous);
//			}
//		}
//
//		String key = input.next();
//		
//		for(GameObject hunter : hunters) {
//		
//			for(GameObject wall : walls) {
//			
//		if((key.equals("a")) && (hunter.getX()==wall.getX()+1) && hunter.getY()==wall.getY()) {
//			hunter.setX(wall.getX()+1);
//		}		
//				
//		else if((key.equals("a"))) {
//			hunter.setX(hunter.getX()-1);
//			VampireController.moveVampire(vampireDb, key);
//			screen.updateScreen(go, input, screen);
//		}
//
//		if((key.equals("s")) && (hunter.getY()==wall.getY()-1) && hunter.getX()==wall.getX()) {
//			hunter.setY(wall.getY()-1);
//		}	
//		
//		else if(key.equals("s")) {
//			hunter.setY(hunter.getY()+1);
//			VampireController.moveVampire(vampireDb, key);
//			screen.updateScreen(go, input, screen);
//		}
//		
//		if((key.equals("d")) && (hunter.getX()==wall.getX()-1) && hunter.getY()==wall.getY()) {
//			hunter.setX(wall.getX()-1);
//		}	
//
//		else if (key.equals("d")) {
//			hunter.setX(hunter.getX()+1);
//			VampireController.moveVampire(vampireDb, key);
//			screen.updateScreen(go, input, screen);
//		}
//		
//		if((key.equals("w")) && (hunter.getY()==wall.getY()+1) && hunter.getX()==wall.getX()) {
//			hunter.setY(wall.getY()+1);
//		}	
//
//		else if(key.equals("w")) {
//			hunter.setY(hunter.getY()-1);
//			VampireController.moveVampire(vampireDb, key);
//			screen.updateScreen(go, input, screen);
//		}
//		}
//	}
//		
		
		

}
