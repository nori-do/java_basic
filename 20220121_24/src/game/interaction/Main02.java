package game.interaction;

public class Main02 {
	public static void main(String[] args) {
		Warrior w1 = new Warrior();
		Trawl tl = new Trawl();
		Trawl t2 = new Trawl();
		Goblin g1 = new Goblin();
		Rabbit r1 = new Rabbit();
		//������ �� �� �����ּ���
		w1.huntTrawl(tl);
		w1.huntTrawl(tl);
		w1.huntTrawl(tl);
		w1.safezone();
		w1.huntTrawl(t2);
		w1.huntTrawl(t2);
		w1.huntTrawl(t2);
		w1.huntGoblin(g1);
		w1.huntGoblin(g1);
		w1.huntRabbit(r1);
	}
}
