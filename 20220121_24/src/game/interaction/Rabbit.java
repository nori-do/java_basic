package game.interaction;

public class Rabbit {
		private int hp;
		private int atk;
		private int exp;

		public Rabbit() {
			this.hp = 3;
			this.atk = 1;
			this.exp = 3;
		}

		public void doBattle(int uAtk) {
			this.hp -= uAtk;
			if(this.hp < 0) {
		return;
			}
			System.out.println("-------------------");
			System.out.println("토끼의 남은 체력 : " + this.hp);
		}

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
