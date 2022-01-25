package game.polymorphism;

public class Main01 {

	public static void main(String[] args) {
		Orc o1 = new Orc();
		Warrior w1 = new Warrior("Ä¡¾à");
		Trawl t1 = new Trawl();
		Trawl t2 = new Trawl();
		Trawl t3 = new Trawl();
		Goblin g1 = new Goblin();
		
		w1.hunt(o1);
		w1.hunt(o1);
		w1.hunt(g1);
		w1.hunt(t1);
		w1.hunt(t1);
		w1.hunt(t1);
		w1.hunt(t1);
		w1.hunt(t1);
		w1.safezone();
		w1.hunt(t2);
		w1.hunt(t2);
		w1.hunt(t2);
		w1.hunt(t2);
		w1.hunt(t2);
		w1.hunt(t3);
		w1.hunt(t3);
		w1.hunt(t3);
		w1.hunt(t3);
		w1.hunt(t3);
	}
}
