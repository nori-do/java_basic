package game.interaction;

public class Orc {
	//오크는 hp, atk 을 가집니다.
	private int hp;
	private int atk;
	private int exp;
	// 생성자응 오크에게 hp 5, atk 3을 부여합니다.
	public Orc() {
		this.hp = 8;
		this.atk = 4;
		this.exp = 15;
	}
	
	// doBattle() 메서드를 만들겠습니다.
	// 유저의 공격력(uAtk)을 입력받아 오크의 체력을 차감합니다.
	public void doBattle(int uAtk) {
			this.hp -= uAtk;
			if(this.hp < 0) {
				return;
			}
			System.out.println("-------------------");
			System.out.println("오크의 남은 체력 : " + this.hp);
	}
	
	
	
	
	
	
	// getter/setter도 만들어 주세요(상호작용때문에 필수)
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
