package accessmodifier;

public class Warrior extends Commoner {

	public Warrior(String name) {
		super(name);
		}
	public void hunt() {
		System.out.println("------------------");
		System.out.println("���簡 ����� �����մϴ�.");
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
		System.out.println("�̸� : " + getName());
		System.out.println("���� : " + getLv());
		System.out.println("ü�� : " + getHp());
		System.out.println("���� : " + getMp());
		System.out.println("����ġ : " + getExp());
	}
	
}
