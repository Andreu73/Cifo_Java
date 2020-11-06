package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import app.Main2;


@Entity
@Table(name="SCREEN")
@NamedQueries({ @NamedQuery(name = "Screen.findByWidth", query = "SELECT a FROM Screen a WHERE a.width = :width"),
				@NamedQuery(name = "Screen.findByHeight", query = "SELECT a FROM Screen a WHERE a.height = :height")})

public class Screen {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int screenIdnumber;
	public int width;
	public int height;
	@Transient
	public String[][] limit;
	
	@OneToMany(mappedBy = "screen", cascade = CascadeType.ALL) 
	private List<Hunter> hunters = new ArrayList<>();

	public Screen() {
		super();
//		this.screenIdnumber = hashCode();
		this.width = Main2.WIDTH;
		this.height = Main2.HEIGHT;
		limit = new String[Main2.HEIGHT][Main2.WIDTH];

	}

	public void addHunter(Hunter hunter) {
		hunters.add(hunter);
		hunter.setScreen(this);
	}
	
	public int getScreenId() {
		return screenIdnumber;
	}

	public void setScreenId(int screenId) {
		this.screenIdnumber = screenId;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
//
//	public String[][] getLimit() {
//		return limit;
//	}
//
//	public void setLimit(String[][] limit) {
//		this.limit = limit;
//	}



	@Override
	public String toString() {
		return "Screen [screenIdnumber=" + screenIdnumber + ", width=" + width + ", height=" + height + ", gous=" + hunters
				+ "]";
	}

//	public void setGous(List<GameObject> gous) {
//		this.gous = gous;
//	}






//	public void updateScreen(ArrayList<GameObject> go, Scanner input, Screen screen) {
//		
//		initScreen();
//		setScreenLimits(go);
//		printScreen();
//		Hunter.moveHunter(go, input, screen);
//	}
	
//	public void setScreenLimits(ArrayList<GameObject> gameObjects) {
//		
//		ArrayList<GameObject> walls = new ArrayList<>();
//		ArrayList<GameObject> others = new ArrayList<>();
//
//		for (int i = 0; i < gameObjects.size(); i++) {
//			GameObject goWall = null;
//			if(GameObjectDb.gameObjects.get(i) instanceof Wall) {
//			goWall = GameObjectDb.gameObjects.get(i);
//			walls.add(goWall);
//			}
//			else {
//				goWall = GameObjectDb.gameObjects.get(i);
//				others.add(goWall);
//			}
//		}
//		
//		for (GameObject other : gameObjects) {
//			
//			for (GameObject wall : walls) {
//
//			if(other.getX() > this.getWidth()-1)
//				other.setX(this.getWidth()-1);
//			
//			else if(other.getY() > this.getHeight()-1)
//				other.setY(this.getHeight()-1);
//			
//			else if(other.getX() < 0)
//				other.setX(0);
//			
//			else if(other.getY() < 0)
//				other.setY(0);
//			
//			this.limit[other.getY()][other.getX()] = other.getSymbol();
//			
//			}
//		}

	public List<Hunter> getHunters() {
		return hunters;
	}

	public void initScreen() {
	for (int i = 0; i < this.height; i++) {
		for (int j = 0; j < this.width; j++) {
			this.limit[i][j] = ".";
		}
	}
}
	

	public void printScreen() {
		for (int i = 0; i < this.height; i++) {
			for (int j = 0; j < this.width; j++) {
				System.out.print(this.limit[i][j]);
			}
			System.out.println();
		}
	}
	

	
}
