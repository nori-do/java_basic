package construcotor;

public class BasketballPlayer {
	//멤버변수(특성)
	//키 height
	//점프력 jumpHight를 선언해주시고
	
	public int height;
	public int jumpHeight;
	
	//생성자 생성
	//int h, int j를 받아야 호출되도록
	//설정해 height, jumpHeight을
	//받아온 값으로 저장받게 만들어주세요.
	public BasketballPlayer(int h, int j) {
		height = h;
		jumpHeight = j;
		System.out.println("생성한 농구선수의 키 :" + height +
				", 점프력 : " + jumpHeight);
	}
	
	// 덩크슛하기 기능 추가
	// height + jumpHeight 가 300을 넘기는 경우는
	// 덩크에 성공했습니다
	// 를 출력하고
	// 그렇지 않다면
	// 골대에 닿지 않았습니다 라고
	// 출력하도록 기능을 추가해주세요.
	// dunkShoot() 입니다.
	public void dunkShoot() {
		int dunkHeight = height + jumpHeight;
		//변수 이름을 설정할 때 확실하게 변수가 
		//어떤 역할을 수행하는지에 대해 정하는 것이 중요하다.
		//나 혼자서 하는 문제라면 상관없지만 다른 사람이 보았을 때
		// 이해할 수 없기 때문.
		if(dunkHeight>300) {
			System.out.println("덩크에 성공했습니다.");
		}else {
			System.out.println("골대에 닿지 않았습니다.");
		}
	
	}
	
}



