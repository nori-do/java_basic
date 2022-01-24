package game.interaction;

public class Magician {
		//Magician의 특성으로
		// 체력(hp), 마나(mp), 공격력(atk), 경험치(exp), 레벨(lv)를 넣어주세요.
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
			System.out.println("마법사의 남은 체력 : " + this.hp);
		}
		public void huntTrawl(Trawl trawl) {
			
			trawl.doBattle(this.atk);
			this.hp -= trawl.getAtk();
			if(trawl.getHp() <= 0) {
				System.out.println("-------------------");
				System.out.println("트롤이 죽었습니다. 경험치 " + trawl.getExp() + "을 획득하셨습니다.");
				this.exp += trawl.getExp();
				return;
			}
			System.out.println("------------------------");
			System.out.println("마법사의 남은 체력 : " + this.hp);
		}
		public void huntGoblin(Goblin goblin) {
			
			goblin.doBattle(this.atk);
			this.hp -= goblin.getAtk();
			if(goblin.getHp() <= 0) {
				System.out.println("-------------------");
				System.out.println("고블린이 죽었습니다. 경험치 " + goblin.getExp() + "을 획득하셨습니다.");
				this.exp += goblin.getExp();
				return;
			}
			System.out.println("------------------------");
			System.out.println("마법사의 남은 체력 : " + this.hp);
		}
		public void safezone() {
			System.out.println("----------------------");
			System.out.println("안전 지대에 들어왔습니다.");
			for(int a=100; this.hp < a; this.hp+=10) {
				if(this.hp <= a) {
					System.out.println("회복 중입니다. 현재 체력 : " + this.hp);
				}
				System.out.println("----------------------");
			}System.out.println("회복이 완료되었습니다.");
		}
		
	public void huntRabbit(Rabbit rabbit) {
			
		rabbit.doBattle(this.atk);
			this.hp -= rabbit.getAtk();
			if(rabbit.getHp() <= 0) {
				System.out.println("-------------------");
				System.out.println("토끼가 죽었습니다. 경험치 " + rabbit.getExp() + "을 획득하셨습니다.");
				this.exp += rabbit.getExp();
				return;
			}
			System.out.println("------------------------");
			System.out.println("마법사의 남은 체력 : " + this.hp);
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
