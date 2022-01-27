package interface1;
//인터페이스는 interface 선언을 사용합니다.
//내부에는 상수인 값과 추상메서드만 선언할 수 있습니다.
//애초에 구현(implements)을 전제로 설계되기 때문에
//일반 변수, 메서드를 내부에 선언할 수 없습니다.
//다형성에서는 인터페이스도 부모클래스처럼 하위 클래스를 대입받을 수 있습니다.
public interface Vehicle {
	//1. 상수 없이 사용
	//2. 자동차의 최대 연료량을 선언해보겠습니다.
	int MAX_GAS = 70;
	int MIN_GAS = 0; // 가스 최소값은 사용할 곳이 없어서 일단 적어놓기만 해봤습니다.
	int MAX_SPEED = 200; // 최고 속력
	int MIN_SPEED = 0; // 최저 속력
	int INCREASE_SPD = 10;
	int DECREASE_SPD = 10;
	int REFUEL_GAS = 30;
	int DECREASE_GAS = 1;
	//3. 자동차의 상수 목록을 만들어보겠습니다.
	//상수화 시킬 여지가 있는 것들은 전부 상수화 시켜주시고, Car에도 적용해주세요.
	
	
	//4. 자동차에 이어 기차를 만들어보겠습니다.
	// Train 클래스를 만들어주시고 역시 Vehicle을 구현합니다.
	//최대속도 400, 연료충전은 700씩, 연료 소모는 30씩, 증가속도는 100, 감속시 50이 감속됩니다.
	int TRANIN_MAX_GAS = 1000;
	int TRANIN_MAX_SPEED = 400; // 최고 속력
	int TRANIN_MIN_SPEED = 0; // 최저 속력
	int TRANIN_INCREASE_SPD = 100;
	int TRANIN_DECREASE_SPD = 50;
	int TRANIN_REFUEL_GAS = 700;
	int TRANIN_DECREASE_GAS = 30;
	
	//탈 것이라면 보편적으로 가지는 공통적 기능을 전부 추상메서드로 작성
	//{
	//	실행문...
	//}
	//와 같은 실행문 부분(메서드의 몸체, body라고도 부름)없이 선언만 해주세요.
	
	public void accel(); // 가속
	public void breakSpeed(); // 감속
	public void reFuel(); // 주유
	public void showStatus(); // 계기판 조호
	
}
