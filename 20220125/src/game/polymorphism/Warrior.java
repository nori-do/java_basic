package game.polymorphism;

public class Warrior {
	//속성(필드, 변수)값으로 name, hp, mp, atk를 추가
	private String name;
	private int hp;
	private int mp;
	private int atk;
	private int exp;
	private int lv;
	//생성자로 위에 설정한 필드들을 초기화해주세요.
	//hp 20, mp 10 atk 4로 고정값을 넣어주시고
	//name은 사용자에게 입력받습니다.
	public Warrior(String name) {
		this.name = name;
		this.hp = 20;
		this.mp = 10;
		this.atk = 4;
		this.exp = 0;
		this.lv = 1;
	}
	
	//hunt()를 만들어주세요
	//Monster타입과 교전이 가능합니다.
	//Monster의 doBattle()을 호출해 자기 데미지를 몬스터에게 넘겨주고
	//몬스터가 살아있다면 다시 몬스터의 공격력만큼 데미지를 받습니다.
	//몬스터가 공격 전에 죽었다면 죽은 몬스터를 공격할 수 없습니다. 라고 나오고
	//몬스터를 죽였다면(몬스터의 체력이 0이하로 내려갓다면) 몬스터를 죽였습니다. 라고 나오게 해주세요.
	public void hunt(Monster monster) {
		monster.doBattle(this.atk);
		if(monster.getHp()<=0) {
			System.out.println("-------------------------------");
			System.out.println(monster.getName() + "(이)가 죽었습니다. 경험치 " + monster.getExp() + "를 흭득했습니다.");
			this.exp += monster.getExp();
		}else {
			this.hp -= monster.getAtk();
			System.out.println("---------------------------------");
			System.out.println(this.name + "의 현재 체력 : " + this.hp);
			}
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
	
	public void lv_up() {
		if(this.exp <= 100) {
			this.lv += 1;
			System.out.println("레벨 " + this.lv + "이 되었습니다.");
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
