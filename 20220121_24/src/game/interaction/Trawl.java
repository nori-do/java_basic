package game.interaction;

public class Trawl {
		private int hp;
		private int atk;
		private int exp;

		public Trawl() {
			this.hp = 10;
			this.atk = 5;
			this.exp = 20;
		}

public void doBattle(int uAtk) {
	this.hp -= uAtk;
	if(this.hp < 0) {
		return;
	}
	System.out.println("-------------------");
	System.out.println("Ʈ���� ���� ü�� : " + this.hp);
}












public int getHp() {
	return hp;
}

public void setHp(int hp) {
	this.hp = hp;
}

public int getAtk() {
	return atk;
}

public void setAtk(int atk) {
	this.atk = atk;
}

public int getExp() {
	return exp;
}

public void setExp(int exp) {
	this.exp = exp;
}

}
