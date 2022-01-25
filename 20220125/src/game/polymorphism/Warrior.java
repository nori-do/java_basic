package game.polymorphism;

public class Warrior {
	//�Ӽ�(�ʵ�, ����)������ name, hp, mp, atk�� �߰�
	private String name;
	private int hp;
	private int mp;
	private int atk;
	private int exp;
	private int lv;
	//�����ڷ� ���� ������ �ʵ���� �ʱ�ȭ���ּ���.
	//hp 20, mp 10 atk 4�� �������� �־��ֽð�
	//name�� ����ڿ��� �Է¹޽��ϴ�.
	public Warrior(String name) {
		this.name = name;
		this.hp = 20;
		this.mp = 10;
		this.atk = 4;
		this.exp = 0;
		this.lv = 1;
	}
	
	//hunt()�� ������ּ���
	//MonsterŸ�԰� ������ �����մϴ�.
	//Monster�� doBattle()�� ȣ���� �ڱ� �������� ���Ϳ��� �Ѱ��ְ�
	//���Ͱ� ����ִٸ� �ٽ� ������ ���ݷ¸�ŭ �������� �޽��ϴ�.
	//���Ͱ� ���� ���� �׾��ٸ� ���� ���͸� ������ �� �����ϴ�. ��� ������
	//���͸� �׿��ٸ�(������ ü���� 0���Ϸ� �������ٸ�) ���͸� �׿����ϴ�. ��� ������ ���ּ���.
	public void hunt(Monster monster) {
		monster.doBattle(this.atk);
		if(monster.getHp()<=0) {
			System.out.println("-------------------------------");
			System.out.println(monster.getName() + "(��)�� �׾����ϴ�. ����ġ " + monster.getExp() + "�� ŉ���߽��ϴ�.");
			this.exp += monster.getExp();
		}else {
			this.hp -= monster.getAtk();
			System.out.println("---------------------------------");
			System.out.println(this.name + "�� ���� ü�� : " + this.hp);
			}
	}
	
		public void safezone() {
			System.out.println("----------------------");
			System.out.println("���� ���뿡 ���Խ��ϴ�.");
			for(int a=100; this.hp < a; this.hp+=10) {
				if(this.hp <= a) {
					System.out.println("ȸ�� ���Դϴ�. ���� ü�� : " + this.hp);
				}
				System.out.println("----------------------");
			}System.out.println("ȸ���� �Ϸ�Ǿ����ϴ�.");
		
	}
	
	public void lv_up() {
		if(this.exp <= 100) {
			this.lv += 1;
			System.out.println("���� " + this.lv + "�� �Ǿ����ϴ�.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
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
