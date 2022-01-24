package game.interaction;

public class Goblin {
	private int hp;
	private int atk;
	private int exp;

	public Goblin() {
		this.hp = 5;
		this.atk = 2;
		this.exp = 5;
	}

	public void doBattle(int uAtk) {
		this.hp -= uAtk;
		if(this.hp < 0) {
	return;
		}
		System.out.println("-------------------");
		System.out.println("고블린의 남은 체력 : " + this.hp);
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
