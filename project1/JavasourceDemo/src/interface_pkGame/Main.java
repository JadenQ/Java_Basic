package interface_pkGame;

public class Main {
	public static void main(String[] args) {
		Hero hero1 = new Warrior(1,"Caocao",0,0);
		Castle castle = new Castle("Wendy",10,80,700);
		
		hero1.PK(castle);
	}
	
}
