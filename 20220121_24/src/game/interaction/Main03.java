package game.interaction;

public class Main03 {
	public static void main(String[] args) {
		Magician m1 = new Magician();
		Orc o1 = new Orc();
		Archer a1 = new Archer();
		Orc o2 = new Orc();
		
		m1.huntOrc(o1);
		m1.huntOrc(o1);
		m1.safezone();
		a1.huntOrc(o1);
		a1.huntOrc(o1);
		a1.safezone();
		m1.huntOrc(o2);
	}
}
