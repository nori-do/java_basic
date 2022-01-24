package game.interaction;

public class Magician {
		//Magician�� Ư������
		// ü��(hp), ����(mp), ���ݷ�(atk), ����ġ(exp), ����(lv)�� �־��ּ���.
		private int hp;
		private int mp;
		private int atk;
		private int exp;
		private int lv;
		
		public Magician(){
			this.lv = 1;
			this.hp = 15;
			this.mp = 20;
			this.atk = 4;
			this.exp = 0;
		}
		
		//��ũ�� ������ �� �ֵ��� huntOrc()�� �����ڽ��ϴ�.
		public void huntOrc(Orc orc) {
			//ore�� doBattle�� ȣ���� ���� ��ũ ü���� ���
			orc.doBattle(this.atk);
			// ��ũ ���ݷ¸�ŭ �ڽ��� ü���� �������ݴϴ�.
			//��ũ�� ������ �������� ���� ��� ����ġ�� 10 �� ���ֽð�
			//��ũ�� �׾����ϴ�. ��� ��Ʈ�� �߰� �޼��尡 ����ǰ� ���ּ���.
			this.hp -= orc.getAtk();
			if(orc.getHp() <= 0) {
				System.out.println("-------------------");
				System.out.println("��ũ�� �׾����ϴ�. ����ġ " + orc.getExp() + "�� ȹ���ϼ̽��ϴ�.");
				this.exp += orc.getExp();
				return;
			}
			System.out.println("------------------------");
			System.out.println("�������� ���� ü�� : " + this.hp);
		}
		public void huntTrawl(Trawl trawl) {
			
			trawl.doBattle(this.atk);
			this.hp -= trawl.getAtk();
			if(trawl.getHp() <= 0) {
				System.out.println("-------------------");
				System.out.println("Ʈ���� �׾����ϴ�. ����ġ " + trawl.getExp() + "�� ȹ���ϼ̽��ϴ�.");
				this.exp += trawl.getExp();
				return;
			}
			System.out.println("------------------------");
			System.out.println("�������� ���� ü�� : " + this.hp);
		}
		public void huntGoblin(Goblin goblin) {
			
			goblin.doBattle(this.atk);
			this.hp -= goblin.getAtk();
			if(goblin.getHp() <= 0) {
				System.out.println("-------------------");
				System.out.println("����� �׾����ϴ�. ����ġ " + goblin.getExp() + "�� ȹ���ϼ̽��ϴ�.");
				this.exp += goblin.getExp();
				return;
			}
			System.out.println("------------------------");
			System.out.println("�������� ���� ü�� : " + this.hp);
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
		
	public void huntRabbit(Rabbit rabbit) {
			
		rabbit.doBattle(this.atk);
			this.hp -= rabbit.getAtk();
			if(rabbit.getHp() <= 0) {
				System.out.println("-------------------");
				System.out.println("�䳢�� �׾����ϴ�. ����ġ " + rabbit.getExp() + "�� ȹ���ϼ̽��ϴ�.");
				this.exp += rabbit.getExp();
				return;
			}
			System.out.println("------------------------");
			System.out.println("�������� ���� ü�� : " + this.hp);
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

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}
		
}
