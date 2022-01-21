package accessmodifier;

public class Warrior {//정의부, 실행은 Main에서 할 예정임.
	
	//변수값은 현실에서도 특정한 물체나 사람의 상태값이 휙휙 바뀌지 않으므로
	//외부에서 값을 함부로 고칠 수 없도록 public 대신 private으로 고칩니다.
	//public : 모든 영역에서 수정/조회 가능, private : 자기자심만 수정/조회가능
	//protected : 같은 패키지/자기자신이 수정/조회 가능
	protected int hp;
	protected int strangth;
	public String name;
	protected int lv;
	protected int money;
	
	// 생성자를 만들어주시되, name만 사용자에게 입력받고
	// 나머지는 hp 20, stangth 3, lv 1, money 0
	// 자동으로 입력받도록 해주세요.
	
	public Warrior(String n) {
		hp = 20;
		strangth = 3;
		name = n;
		lv = 1;
		money = 0;
	}
	// hunt(사냥하기) 메서드를 만들어보겠습니다.
	// 이 메서드는 실행시 사냥을 하는 상황을 구현하며
	// 체력이 2깎이고 돈을 10씩 획듹합니다.
	// 사냥결과 체력이 X가 되었고, 소지금은 Y입니다. 라고 출력한다.
	// 생성자를 비롯한 메서드는 "행동"을 나타내고
	// 이런 행동의 성공/ 실패 여부는 오로지 정보(변수)에 의해 결정되며
	// 시도자체에 대해서는 제한을 두지 않는다.
	public void hunt() {
		hp -= 2;
		money += 10;
		System.out.println("사냥결과 체력이 " + hp +
						"되었고, 소지금은 " + money + "입니다.");
	}
}
