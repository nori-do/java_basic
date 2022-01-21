package accessmodifier;

public class Warrior extends Commoner {

	public Warrior(String name) {
		super(name);
		}
	public void hunt() {
		System.out.println("------------------");
		System.out.println("전사가 사냥을 시작합니다.");
		setHp(getHp() - 1);
		setExp(getExp() + 10);
	}
	public void doubleAttack() {
		System.out.println("--------------------");
		System.out.println("doubleAttack");
		setHp(getHp() - 4);
		setExp(getExp() + 25);
	}
	public void getInfo() {
		System.out.println("--------------------");
		System.out.println("이름 : " + getName());
		System.out.println("레벨 : " + getLv());
		System.out.println("체력 : " + getHp());
		System.out.println("마나 : " + getMp());
		System.out.println("경험치 : " + getExp());
	}
	
}
