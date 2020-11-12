package model;

import java.io.Serializable;
import java.util.Random;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import app.Main2;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

//@Entity
@MappedSuperclass
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@Table(name="GAMEOBJECT")


public class GameObject{
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int objectIdnumber;
	public int x;
	public int y;
	public String symbol;
	
	Random random = new Random();

	public GameObject(String symbol) {
//	public GameObject(Screen screen, String symbol) {
		super();
//		this.objectIdnumber = hashCode();
//		this.screen = screen;
		this.symbol = symbol;
		setPositionXY();
		
	}

	public void setPositionXY() {
		
		int numberWidth = random.nextInt(Main2.WIDTH);
		int numberHeight = random.nextInt(Main2.HEIGHT);
				
		int[] a = {numberWidth, numberHeight};

		setX(a[0]);
		setY(a[1]);	

	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}


	
}
