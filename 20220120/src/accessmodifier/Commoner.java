package accessmodifier;

public class Commoner {
	//private 요소는 자식쪽에서도 조회나 수정이 불가능합니다.
	//보안성이 제일 뛰어나기 때문에 private을 쓰는게 권장되는데
	// 이 경우 setter, getter라는 메서드를 이용해 보조합니다.
	private int hp;
	private int mp;
	private int lv;
	private int exp;
	protected String name;
	
	//생성자를 이용해 이름은 사용자가 입력하도록 해 주시고
	// hp는 20, mp 10, lv 1, exp 0을 기본값으로 넣어주세요
	
	public Commoner(String name) {
		this.hp = 20;
		this.mp = 10;
		this.lv = 1;
		this.exp = 0;
		this.name = name;
	}

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

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}

