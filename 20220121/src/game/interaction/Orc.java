package game.interaction;

public class Orc {
	//��ũ�� hp, atk �� �����ϴ�.
	private int hp;
	private int atk;
	private int exp;
	// �������� ��ũ���� hp 5, atk 3�� �ο��մϴ�.
	public Orc() {
		this.hp = 5;
		this.atk = 3;
		this.exp = 10;
	}
	
	// doBattle() �޼��带 ����ڽ��ϴ�.
	// ������ ���ݷ�(uAtk)�� �Է¹޾� ��ũ�� ü���� �����մϴ�.
	public void doBattle(int uAtk) {
			this.hp -= uAtk;
			if(this.hp < 0) {
				return;
			}
			System.out.println("-------------------");
			System.out.println("��ũ�� ���� ü�� : " + this.hp);
	}
	
	
	
	
	
	
	// getter/setter�� ����� �ּ���(��ȣ�ۿ붧���� �ʼ�)
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
