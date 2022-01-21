package game.interaction;

public class Warrior {
	// Warrior의 특성으로
	// 체력(hp), 마나(mp), 공격력(atk), 경험치(exp), 레벨(lv)를 넣어주세요.
	private int hp;
	private int mp;
	private int atk;
	private int exp;
	private int lv;
	
	// 생성자를 생성해서 아무것도 입력받지 않고
	// 체력은 20, 마나는 10, 공격력은 4, 레벨 1, 경험치는 0이 자동 입력되게 해주세요.
	public Warrior(){
		this.lv = 1;
		this.hp = 20;
		this.mp = 10;
		this.atk = 4;
		this.exp = 0;
	}
	
	//오크와 교전할 수 있도록 huntOrc()를 만들어보겠습니다.
	public void huntOrc(Orc orc) {
		//ore의 doBattle을 호출해 먼저 오크 체력을 깎고
		orc.doBattle(this.atk);
		// 오크 공격력만큼 자신의 체력을 차감해줍니다.
		//오크가 전사의 공격으로 죽은 경우 경험치를 10 더 해주시고
		//오크가 죽었습니다. 라는 멘트가 뜨고 메서드가 종료되게 해주세요.
		this.hp -= orc.getAtk();
		if(orc.getHp() <= 0) {
			System.out.println("-------------------");
			System.out.println("오크가 죽었습니다. 경험치 " + orc.getExp() + "을 획득하셨습니다.");
			this.exp += orc.getExp();
			return;
		}
		System.out.println("------------------------");
		System.out.println("전사의 남은 체력 : " + this.hp);
	}
	
	
	
	
	
	
	// 타 몬스터 쪽에서 전사 스탯을 조회할 수 있도록 Getter/Setter를 만들어주세요.
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
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

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}
	
	
	
}
