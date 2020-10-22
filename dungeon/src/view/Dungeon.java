package view;

public class Dungeon {

	final int LENGTH = 20;
	final int HEIGHT = 10;
	final int VAMPIRES = 3;
	final int MOVES = 14;
	final boolean VAMPIRES_MOVE = true;
	
	public Dungeon() {
		
	}
	
	public void initialScreen() {
		
		for (int i = 0; i < LENGTH; i++) {
			
			System.out.println(".");
			for (int j = 0; j < HEIGHT; j++) {
				System.out.println(".");
			}
			
		}
		
		
	}

}
