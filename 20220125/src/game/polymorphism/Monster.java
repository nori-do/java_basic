package game.polymorphism;

public class Monster {
	//hp, atk�� ����(�ʵ�, �Ӽ�)�� �����ϴ�.
	private int hp;
	private int atk;
	private int exp;
	private String name;
	//�����ڱ��� ������ּ���.
	//ü�°� ���ݷ��� ���ͺ��� �� �޶�� �ϴ� �Է¹ް� ���ּ���.
	public Monster(int hp, int atk, int exp, String name) {
		this.hp = hp;
		this.atk = atk;
		this.exp = exp;
		this.name = name;
	}
	
	//doBattle(int)�� �������ּ���.
	//������� ���ݷ� uAtk��ŭ ������ ü���� ���Դϴ�.
	//ü���� 0�� �Ǹ� �ش� ���Ϳ� ������ �Ұ����ϴٴ� �޼����� �����ݴϴ�.
	//ü���� 0���� ������ ���� ü���� �������� �ܼ�â�� ����ݴϴ�.
	
	public void doBattle(int uAtk) {
		this.hp -= uAtk;
		if(this.hp <= 0) {
			System.out.println("------------------------------------------------------");
			System.out.println(this.name + "(��)�� �׾����ϴ�.");
			return;
		}else {
			System.out.println("------------------------------------");
			System.out.println(this.name + "(��)�� ������ �޾ҽ��ϴ�.");
			System.out.println("���� ü�� : " + this.hp);
		}
	}

	/*public void doBattle(int uAtk) {
		this.hp -= uAtk;
		System.out.println("���Ͱ� ������ �޾ҽ��ϴ�.");
		System.out.println("ü���� " + this.hp + "���ҽ��ϴ�.");
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
	
	
	
}
