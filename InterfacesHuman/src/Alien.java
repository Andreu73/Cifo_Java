import interfaces.IActionAlien;

public class Alien implements IActionAlien{

	public String name;
	public boolean isMortal;

	public Alien(String name, boolean isMortal) {
		super();
		this.name= name;
		this.isMortal = isMortal;
	}
	
	
	public void levitate() {
		System.out.println("Alien levitates in the sky");
	}
	
	public void fly() {
		System.out.println("Alien flies without wings");		
	}
	
	public void empathize() {
		System.out.println("Alien empathizes with humans");
		
	}
	
	
}
